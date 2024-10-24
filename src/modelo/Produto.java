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
public class Produto {
    
    private int codigo;
    private String nome;
    private double valor;
    private Categoria categoria;
    
    public Produto() {
    }

    public Produto(String nome, double valor, Categoria categoria) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
    }

    public Produto(int codigo, String nome, double valor, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", valor=" + valor + ", categoria=" + categoria + ", codigo=" + codigo + '}';
    }

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.categoria);
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
        final Produto other = (Produto) obj;
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.categoria, other.categoria);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
 
}
