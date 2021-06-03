/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pas.group.cinemaisingresso;

import java.util.ArrayList;

/**
 *
 * @author Murilo Andrade
 */
public class Cinema {
    private String shopping;
    private ArrayList<Sala> salas;
    private Catalogo catalogo;
    
    /**
     * @return the shopping
     */
    public String getShopping() {
        return shopping;
    }

    /**
     * @param shopping the shopping to set
     */
    public void setShopping(String shopping) {
        this.shopping = shopping;
    }

    /**
     * @return the salas
     */
    public ArrayList<Sala> getSalas() {
        return salas;
    }

    /**
     * @param salas the salas to set
     */
    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    /**
     * @return the catalogo
     */
    public Catalogo getCatalogo() {
        return catalogo;
    }

    /**
     * @param catalogo the catalogo to set
     */
    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
}
