/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.Conexao;
import modelo.Categoria;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class CategoriaDao {
    
    public void adicionar(Categoria categoria)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO categoria (nome, descricao) values (?, ?) ";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, categoria.getNome());
        ps.setString(2, categoria.getDescricao());
        ps.execute();
        ps.close();
        conexao.close(); 
    } 
    
    
    public List<Categoria> buscarPeloNome(String nome) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from categoria where nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        List<Categoria> categorias = new ArrayList<>();
        while (rs.next()) {
            Categoria categoria = new Categoria(
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getInt("codigo"));
        categorias.add(categoria);
        }          
        rs.close();
        ps.close();
        conexao.close();
        
        return categorias;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql="delete from categoria where codigo= ?";
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         ps.executeUpdate();
         ps.close();
         conexao.close();
        
    }
    
    public void alterar(Categoria categoria)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "UPDATE categoria set nome=?, descricao=?"
                + " where codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,categoria.getNome());
        ps.setString(2, categoria.getDescricao());
        ps.setInt(3, categoria.getCodigo());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
    public List<Categoria> buscar(){
        String sql="select * from categoria";
        Connection conexao = new Conexao().getConexao();
        try {
          PreparedStatement ps = conexao.prepareStatement(sql);
            List<Categoria> resultado = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setCodigo(rs.getInt("codigo"));
                categoria.setNome(rs.getString("nome"));
                categoria.setDescricao(rs.getString("descricao"));
                
                resultado.add(categoria);
            }
            return resultado;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
    public Categoria buscarId(int codigo)throws SQLException{
        
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from categoria where codigo like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + codigo + "%");
        ResultSet rs = ps.executeQuery();
        Categoria categoria = new Categoria(
                rs.getString("nome"),
                rs.getString("descricao"),
                rs.getInt("codigo"));
        rs.close();
        ps.close();
        conexao.close();
        
        return categoria;
    }
    
}
