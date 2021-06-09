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
public class Filme {
    private String titulo;
    private int duracao;
    private int classificacao;
    private String descricao;
    private String diretor;
    private String atorPrincipal;
    private String categoria;

    public Filme(String titulo, int duracao, int classificacao, String descricao, String diretor, String atorPrincipal, String categoria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.categoria = categoria;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
