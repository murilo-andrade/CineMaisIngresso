/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import model.Catalogo;
import model.Cinema;
import model.Filme;
import model.Ingresso;
import model.Sala;
import model.Sessao;

/**
 *
 * @author samuel
 */
public class Database {
    
    private Cinema cinema;
    private Catalogo catalogo;
    private Filme filme;
    private Ingresso ingresso;
    private Sala sala;
    private Sessao sessao;
    
    private ArrayList<Cinema> cinemas;
    private ArrayList<Ingresso> ingressos;
    private ArrayList<Sessao> sessoes;
    private ArrayList<Filme> filmes = new ArrayList<Filme>();
    
    private Database() {
        this.filme = new Filme("Teste", 150, 12, "Descrição Teste", "Samuel", "Samuel L. Jackson", "Ação");
    }
    
    public static Database connect() {
        Database database = new Database();
        System.out.println("Database is up!");
        return database;
    }
    
    public boolean addFilme(Filme filme) {
        filmes.add(filme);
        return true;
    }
    
    public Filme getFilme(String titulo) {
        for(Filme filme : filmes) {
            if(filme.getTitulo().equals(titulo)){
                System.out.println(filme.getTitulo());
                return filme;
            }
        }
        System.out.println(this.filme.getTitulo());
        return this.filme;
    }
    
}
