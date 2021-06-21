package model;

public class Sala {
    private int numero;
    private int capacidade;
    private int is3d;
    private int id;

    public int getId() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

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
    public int getIs3d() {
        return is3d;
    }

    /**
     * @param is3d the is3d to set
     */
    public void setIs3d(int is3d) {
        this.is3d = is3d;
    }
}
