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
public class Evento {
    private int codEvento;
    private String nomeDoEvento;
    private String game;
    private String vagas;
    private int data;
    private int horario;
    private String linck;
    private String premiacao;
   
    public   Evento(int codEvento, String nomeDoEvento, String game, String vagas, int data, int horario, String linck, String premiacao){
        this.codEvento = codEvento;
        this.nomeDoEvento = nomeDoEvento;
        this.game = game;
        this.vagas = vagas;
        this.data = data;
        this.horario = horario;
        this.linck = linck;
        this.premiacao = premiacao;
        
}

    public int getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(int codEvento) {
        this.codEvento = codEvento;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getLinck() {
        return linck;
    }

    public void setLinck(String linck) {
        this.linck = linck;
    }

    public String getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(String premiacao) {
        this.premiacao = premiacao;
    }
}
