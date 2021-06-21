package model;

public class Filme {
    private int id;
    private String titulo;
    private String duracao;
    private String classificacao;
    private String descricao;
    private String diretor;
    private String atorPrincipal;
    private String categoria;

    public Filme() {
        
    }
    public Filme(String titulo, String duracao, String classificacao, String descricao, String diretor, String atorPrincipal, String categoria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
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
