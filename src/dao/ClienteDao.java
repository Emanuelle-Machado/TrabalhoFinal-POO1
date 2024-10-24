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
import modelo.Cliente;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class ClienteDao {
    
    public void adicionar(Cliente cliente)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO cliente (nome, cpf, telefone, rua, numero, bairro, cep) values (?, ?, ?, ?, ?, ?, ?) ";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getCpf());
        ps.setString(3, cliente.getTelefone());
        ps.setString(4, cliente.getRua());
        ps.setInt(5, cliente.getNumero());
        ps.setString(6, cliente.getBairro());
        ps.setString(7, cliente.getCep());
        ps.execute();
        ps.close();
        conexao.close(); 
    } 
    
    public List<Cliente> buscarPeloNome(String nome) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from cliente where nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        List<Cliente> clientes = new ArrayList<>();
        while (rs.next()) {
            Cliente cliente = new Cliente(
            rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("telefone"),
                    rs.getString("rua"),
                    rs.getInt("numero"),
                    rs.getString("bairro"),
                    rs.getString("cep"),
                    rs.getInt("codigo"));
        clientes.add(cliente);
        }          
        rs.close();
        ps.close();
        conexao.close();
        
        return clientes;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql="delete from cliente where codigo=?";
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         ps.executeUpdate();
         ps.close();
         conexao.close();
        
    }
   
    public void alterar(Cliente cliente)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "UPDATE cliente set nome=?, cpf=?, telefone=?, rua=?, numero=?, bairro=?, cep=? where codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,cliente.getNome());
        ps.setString(2, cliente.getCpf());
        ps.setString(3,cliente.getTelefone());
        ps.setString(4, cliente.getRua());
        ps.setInt(5, cliente.getNumero());
        ps.setString(6, cliente.getBairro());
        ps.setString(7, cliente.getCep());
        ps.setInt(8, cliente.getCodigo());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
}
