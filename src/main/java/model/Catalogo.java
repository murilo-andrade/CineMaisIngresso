/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Murilo Andrade
 */
public class Catalogo {
    private ArrayList<Sessao> sessao;
    private Filme resultado;

    public Filme consultarFilmes(String dia){
        return this.getResultado();
    }
    
    /**
     * @return the sessao
     */
    public ArrayList<Sessao> getSessao() {
        return sessao;
    }

    /**
     * @param sessao the sessao to set
     */
    public void setSessao(ArrayList<Sessao> sessao) {
        this.sessao = sessao;
    }

    /**
     * @return the resultado
     */
    public Filme getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(Filme resultado) {
        this.resultado = resultado;
    }
}
