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
public class Pessoa {

    private int codPessoa;
    private String nome;
    

    public Pessoa(int codPessoa, String nome) {
        this.codPessoa = codPessoa;
        this.nome = nome;
    }
    
    public Pessoa(){
    
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public int getCodPessoa() {
        return codPessoa;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String toString() {
        String dadosPessoa = "código: " + codPessoa
                + "\nnome: " + nome;
        return dadosPessoa;
    }        
}
