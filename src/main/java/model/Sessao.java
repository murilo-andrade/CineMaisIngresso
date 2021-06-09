/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Murilo Andrade
 */
public class Sessao {
    private String horario;
    private String data;
    private float ingresso;
    private Filme filme;
    private int ocupacao;
    private Sala sala;

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the ingresso
     */
    public float getIngresso() {
        return ingresso;
    }

    /**
     * @param ingresso the ingresso to set
     */
    public void setIngresso(float ingresso) {
        this.ingresso = ingresso;
    }

    /**
     * @return the filme
     */
    public Filme getFilme() {
        return filme;
    }

    /**
     * @param filme the filme to set
     */
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    /**
     * @return the ocupacao
     */
    public int getOcupacao() {
        return ocupacao;
    }

    /**
     * @param ocupacao the ocupacao to set
     */
    public void setOcupacao(int ocupacao) {
        this.ocupacao = ocupacao;
    }

    /**
     * @return the sala
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
