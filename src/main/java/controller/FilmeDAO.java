/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Database;
import model.ConnectionFactory;
import model.Filme;

/**
 *
 * @author samuel
 */
public class FilmeDAO {
    
    public boolean addFilme(Database db, Filme filme){
        boolean resultado;
        resultado = db.addFilme(filme);
        return resultado;
    }
    
    public Filme getFilme(Database db, String titulo) {
        Filme filme;
        filme = db.getFilme(titulo);
        return filme;
    }
    
}
