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
public class Cadastrar {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private int codCadastro;
    private String nome;
    private String instituicao;
    private String email;
    private String login;
    private int senha;
}
public   Cadastrar(int codCadastro, String nome, String instituicao, String email, String login, int senha) {
        this.codCadastro = codCadastro;
        this.nome = nome;
        this.instituicao = instituicao;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }
