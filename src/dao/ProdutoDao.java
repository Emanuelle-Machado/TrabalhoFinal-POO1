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
import modelo.Produto;
import java.sql.ResultSet;
import modelo.Categoria;

/**
 *
 * @author Usuario
 */
public class ProdutoDao {
    
    public void adicionar(Produto produto)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO produto (nome, valor, categoria_codigo) values (?, ?, ?) ";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, produto.getNome());
        ps.setDouble(2, produto.getValor());
        ps.setInt(3, produto.getCategoria().getCodigo());
        ps.execute();
        ps.close();
        conexao.close();
        
        
    } 
    /*
    public List<Produto> buscarPeloNome(String nome) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from produto where nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        
        List<Produto> produtos = new ArrayList<>();
        List<Categoria> categorias = new ArrayList<>();
        
        while (rs.next()) {
            Produto produto =  new Produto();
            produto.setCodigo(rs.getInt("codigo"));
            produto.setNome(rs.getString("nome"));
            produto.setValor(rs.getDouble("valor"));
            
            Categoria categoria = new Categoria();
            categoria.setNome(rs.getString("nome"));
            categoria.setDescricao(rs.getString("descricao"));
            categoria.setCodigo(rs.getInt("codigo"));
            
            categorias.add(categoria);
            produto.setCategoria(categoria);
            
        produtos.add(produto);
        }      
        
        rs.close();
        ps.close();
        conexao.close();
        
        return produtos;
    }
    */
    public List<Produto> buscarPeloNome(String nome) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from produto where nome like ?";
        
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        
        ResultSet rs = ps.executeQuery();
        List<Produto> produtos = new ArrayList<>();
        
        while (rs.next()) {
            
            Produto produto =  new Produto();
            produto.setCodigo(rs.getInt("codigo"));
            produto.setNome(rs.getString("nome"));
            produto.setValor(rs.getDouble("valor"));
            
            Categoria categoria_codigo = new Categoria();
            categoria_codigo.setCodigo(rs.getInt("categoria_codigo"));
            
            produto.setCategoria(categoria_codigo);
        produtos.add(produto);
        }          
        rs.close();
        ps.close();
        conexao.close();
        
        return produtos;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql="delete from produto where codigo= ?";
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         ps.executeUpdate();
         ps.close();
         conexao.close();
        System.out.println("removido");
    }
    
    public void alterar(Produto produto)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "UPDATE produto set nome=?,valor=?,categoria_codigo=?"
                + " where codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,produto.getNome());
        ps.setDouble(2, produto.getValor());
        ps.setInt(3, produto.getCategoria().getCodigo());
        ps.setInt(4, produto.getCodigo());
        ps.executeUpdate();
        ps.close();
        conexao.close();
        System.out.println("alterado");
    }
    
}
