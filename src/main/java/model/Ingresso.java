package model;

public class Ingresso {
    private String dataVenda;
    private int cancelado;
    private double valor;
    private String filme;
    private Sala sala;
    private int id;

    public Ingresso() {
        this.valor = 50;
        this.cancelado = 0;
    }

    public int getId() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }
    
    public void imprimir(){
    }

    /**
     * @return the dataVenda
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the cancelado
     */
    public int getCancelado() {
        return cancelado;
    }

    /**
     * @param cancelado the cancelado to set
     */
    public void setCancelado(int cancelado) {
        this.cancelado = cancelado;
    }

    /**
     * @return the sessao
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param sessao the sessao to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double calcValorIngresso()
    {
        if(sala.getIs3d() == 1) {
            return  getValor() * 1.2; 
        }
        else {
            return getValor();
        }
    }
}
