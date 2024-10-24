/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.Conexao;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class UsuarioDao {
    
    public Usuario login(String login, String senha) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM usuario WHERE login=? AND senha=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        ResultSet rs=ps.executeQuery();
        Usuario usuario = null;
        
        while(rs.next()){
            usuario = new Usuario();
            usuario.setCodigo(rs.getInt("codigo"));
            usuario.setNome(rs.getString("nome"));
            usuario.setLogin(rs.getString("login"));
            //usuario.setSenha(rs.getString("senha"));  <- não terá
            usuario.setNivel(rs.getString("nivel"));
        }
        
        rs.close();
        ps.close();
        conexao.close();
        
        return usuario;   
    }
    
    public void adicionar(Usuario usuario)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO usuario (nome, login, senha, nivel) values (?, ?, ?, ?) ";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getLogin());
        ps.setString(3, usuario.getSenha());
        ps.setString(4, usuario.getNivel());
        ps.execute();
        ps.close();
        conexao.close();
    } 
    
    public List<Usuario> buscarPeloNome(String nome) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from usuario where nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        List<Usuario> usuarios = new ArrayList<>();
        while (rs.next()) {
            Usuario usuario = new Usuario(
                    rs.getString("nome"),
                    rs.getString("login"),
                    rs.getString("senha"),
                    rs.getString("nivel"),
                    rs.getInt("codigo"));
        usuarios.add(usuario);
        }          
        rs.close();
        ps.close();
        conexao.close();
        
        return usuarios;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql="delete from usuario where codigo= ?";
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         ps.executeUpdate();
         ps.close();
         conexao.close();
        
    }
    
    public void alterar(Usuario usuario)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "UPDATE usuario set nome=?,login=?,senha=?,nivel=?"
                + " where codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,usuario.getNome());
        ps.setString(2, usuario.getLogin());
        ps.setString(3,usuario.getSenha());
        ps.setString(4, usuario.getNivel());
        ps.setInt(5, usuario.getCodigo());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
}
