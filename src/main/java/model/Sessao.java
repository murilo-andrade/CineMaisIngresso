package model;

public class Sessao {
    private String horario;
    private String dia;
    private Filme filme;
    private int ocupacao;
    private int numSala;
    private int id;

    public int getId() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

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
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
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
    public int getNumSala() {
        return numSala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(int numSala) {
        this.numSala = numSala;
    }
}
