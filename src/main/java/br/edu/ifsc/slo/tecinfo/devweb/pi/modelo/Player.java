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
    }
