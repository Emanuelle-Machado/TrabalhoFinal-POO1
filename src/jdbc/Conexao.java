/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexao {
    
    private final String database = "confeitaria";
    private final String user = "root";
    private final String password = "";
    
    public Connection getConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/"+database+"?userSSL",user,password);
                    
        }catch(SQLException ex){
            System.out.print("Erro ao tentar conexão");
        throw new RuntimeException(ex);
        }
    }
    
}
