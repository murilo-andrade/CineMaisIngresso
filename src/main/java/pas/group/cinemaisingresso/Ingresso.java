package pas.group.cinemaisingresso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Murilo Andrade
 */
public class Ingresso {
    private String dataVenda;
    private boolean cancelado;
    private Sessao sessao;
    
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
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * @param cancelado the cancelado to set
     */
    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    /**
     * @return the sessao
     */
    public Sessao getSessao() {
        return sessao;
    }

    /**
     * @param sessao the sessao to set
     */
    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}
