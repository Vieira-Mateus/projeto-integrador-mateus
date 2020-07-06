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
public class Player {
    private int codPlayer;
    private int cpf;
    private int rg;
    private String nome;
    private String email;
    private String login;
    private int senha;
    
    public  Player(int codPlayer, int cpf, int rg, String nome, String email, String login, int senha){
        this.codPlayer = codPlayer;
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        
        
}

    public int getCodPlayer() {
        return codPlayer;
    }

    public void setCodPlayer(int codPlayer) {
        this.codPlayer = codPlayer;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    }
