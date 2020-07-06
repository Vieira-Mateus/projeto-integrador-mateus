/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.slo.tecinfo.devweb.pi.modelo;

import javax.lang.model.SourceVersion;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author mateu
 */
@Entity
public class Organizador {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private int codCadastro;
    private String nome;
    private String instituicao;
    private String email;
    private String login;
    private int senha;

public   Organizador(int codCadastro, String nome, String instituicao, String email, String login, int senha) {
        this.codCadastro = codCadastro;
        this.nome = nome;
        this.instituicao = instituicao;
        this.email = email;
        this.login = login;
        this.senha = senha;
 

}

    public int getCodCadastro() {
        return codCadastro;
    }

    public void setCodCadastro(int codCadastro) {
        this.codCadastro = codCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
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