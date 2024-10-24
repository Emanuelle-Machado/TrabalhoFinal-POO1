/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Usuario {
    
   
    private String nome;
    private String login;
    private String senha;
    private String nivel;
    private int codigo;

    public Usuario() {
    }

    public Usuario(String nome, String login, String senha, String nivel) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
    }

    public Usuario(String nome, String login, String senha, String nivel, int codigo) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", login=" + login + ", senha=" + senha + ", nivel=" + nivel + ", codigo=" + codigo + '}';
    } 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.login);
        hash = 41 * hash + Objects.hashCode(this.senha);
        hash = 41 * hash + Objects.hashCode(this.nivel);
        hash = 41 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return Objects.equals(this.nivel, other.nivel);
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
}
