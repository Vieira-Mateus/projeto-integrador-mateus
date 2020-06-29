/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.slo.tecinfo.devweb.pi.modelo;

/**
 *
 * @author mateu
 */
public class Inscrito {
    private String nome;
    private String nomeEquipe;

    
     public  Inscrito(String nome, String nomeEquipe){
        this.nome = nome;
        this.nomeEquipe = nomeEquipe;
     
       
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }
}