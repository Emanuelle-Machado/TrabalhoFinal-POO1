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
import modelo.Funcionario;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class FuncionarioDao {
    
    public void adicionar(Funcionario funcionario)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO funcionario (nome, cpf, telefone, funcao, salario) values (?, ?, ?, ?, ?) ";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, funcionario.getNome());
        ps.setString(2, funcionario.getCpf());
        ps.setString(3, funcionario.getTelefone());
        ps.setString(4, funcionario.getFuncao());
        ps.setDouble(5, funcionario.getSalario());
        ps.execute();
        ps.close();
        conexao.close();
    } 
    
    public List<Funcionario> buscarPeloNome(String nome) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from funcionario where nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        List<Funcionario> funcionarios = new ArrayList<>();
        while (rs.next()) {
            Funcionario funcionario = new Funcionario(
            rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("telefone"),
                    rs.getString("funcao"),
                    rs.getDouble("salario"),
                    rs.getInt("codigo"));
        funcionarios.add(funcionario);
        }          
        rs.close();
        ps.close();
        conexao.close();
        
        return funcionarios;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql="delete from funcionario where codigo= ?";
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         ps.executeUpdate();
         ps.close();
         conexao.close();
        
    }
    
    public void alterar(Funcionario funcionario)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "UPDATE funcionario set nome=?, cpf=?, telefone=?, funcao=?, salario=?"
                + " where codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,funcionario.getNome());
        ps.setString(2, funcionario.getCpf());
        ps.setString(3,funcionario.getTelefone());
        ps.setString(4, funcionario.getFuncao());
        ps.setDouble(5, funcionario.getSalario());
        ps.setInt(6, funcionario.getCodigo());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
}
