/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gdsant
 */
public class Livro {
    private int codLivro;
    private String tituloLivro;
    private int codPessoa;
        
    public Livro(){
        
    }
    
    public Livro(int codLivro, String tituloLivro, int codPessoa){
        this.codLivro = codLivro;
        this.tituloLivro = tituloLivro;
        this.codPessoa = codPessoa;
    }
    
    public String toString(){
        String dadosLivro = "código Livro: " + codLivro
                + "\ntítulo: " + tituloLivro
                + "\ncódigo Pessoa: " + codPessoa;
        
        return dadosLivro;
    }        
    
    public int getCodLivro(){
        return codLivro;
    }
    
    public String getTituloLivro() {
        return tituloLivro;
    }
    
    public int getCodPessoa(){
        return codPessoa;
    }
    
    public void setTituloLivro(String titulo){
        this.tituloLivro = titulo;
    }
    
    public void setCodPessoa(int codPessoa){
        this.codPessoa = codPessoa;
    }
}
