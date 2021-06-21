package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import factory.ConnectionFactory;
import model.Filme;

public class FilmeDAO {

    Connection con = null;
    
    public void createFilme(Filme filme) throws SQLException {

        try {
            String sql = "INSERT INTO filmes(titulo, duracao, classificacao, descricao, diretor, atorPrincipal, categoria) VALUES(?, ?, ?, ?, ?, ?, ?)";

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            pstm = con.prepareStatement(sql);

            pstm.setString(1, filme.getTitulo());
            pstm.setString(2, filme.getDuracao());
            pstm.setString(3, filme.getClassificacao());
            pstm.setString(4, filme.getDescricao());
            pstm.setString(5, filme.getDiretor());
            pstm.setString(6, filme.getAtorPrincipal());
            pstm.setString(7, filme.getCategoria());

            pstm.executeUpdate();
            System.out.println("Filme Salvo!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Filme> getFilmes() {
        
        List<Filme> filmes = new ArrayList<>();

        try {
            String sql = "SELECT * FROM filmes";

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            ResultSet rset = null;

            pstm = con.prepareStatement(sql);

            rset = pstm.executeQuery();

            while(rset.next()) {
                
                Filme filme = new Filme();
                filme.setId(rset.getInt("id"));
                filme.setTitulo(rset.getString("titulo"));
                filme.setDuracao(rset.getString("duracao"));
                filme.setClassificacao(rset.getString("classificacao"));
                filme.setDescricao(rset.getString("descricao"));
                filme.setAtorPrincipal(rset.getString("atorPrincipal"));
                filme.setCategoria(rset.getString("categoria"));

                filmes.add(filme);
            }

            System.out.println("Filmes Buscados!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return filmes;


    }

    public void updateFilme(Filme filme) {
        
        String sql = "UPDATE filmes SET titulo = ?, duracao = ?, classificacao = ?, descricao = ?, diretor = ?, atorPrincipal = ?, categoria = ? WHERE id = ?";

        try {
            

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            pstm = con.prepareStatement(sql);

            pstm.setString(1, filme.getTitulo());
            pstm.setString(2, filme.getDuracao());
            pstm.setString(3, filme.getClassificacao());
            pstm.setString(4, filme.getDescricao());
            pstm.setString(5, filme.getDiretor());
            pstm.setString(6, filme.getAtorPrincipal());
            pstm.setString(7, filme.getCategoria());
            pstm.setInt(8, filme.getId());

            pstm.executeUpdate();
            System.out.println("Filme Alterado!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public Filme readFilme(String titulo) {
        return Filme;        
    }*/

    public void deleteFilme(int idFilme) {
        
        String sql = "DELETE FROM filmes WHERE id = ?";

        try {
            

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            pstm = con.prepareStatement(sql);

            pstm.setInt(1, idFilme);

            pstm.execute();
            System.out.println("Filme Apagado!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

