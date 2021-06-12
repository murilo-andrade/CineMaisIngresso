/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Filme;
import controller.FilmeDAO;
import model.ConnectionFactory;
import database.Database;

/**
 *
 * @author samuel
 */
public class Teste {
    
    public static void main(String args[]) {
        
        boolean result;
        ConnectionFactory conn = new ConnectionFactory();
        FilmeDAO filmeDao = new FilmeDAO();
        Filme filmeAdd = new  Filme("Teste", 150, 12, "Descrição Teste", "Samuel", "Samuel L. Jackson", "Ação");
        result = filmeDao.addFilme(conn.getConn(), filmeAdd);
        if(result) {
            System.out.println("Filme adicionado com sucesso!");
        }
        
        Filme filme = filmeDao.getFilme(Database.connect(), "Teste");
        if(filme != null) {
            System.out.println(filme.getTitulo());
        }
    }
    
}
