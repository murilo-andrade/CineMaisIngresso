/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pas.group.cinemaisingresso;

/**
 *
 * @author Murilo Andrade
 */
public class Sala {
    private int numero;
    private int capacidade;
    private boolean is3d;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return the is3d
     */
    public boolean isIs3d() {
        return is3d;
    }

    /**
     * @param is3d the is3d to set
     */
    public void setIs3d(boolean is3d) {
        this.is3d = is3d;
    }
}
