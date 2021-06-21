package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Cinema;

public class CinemaDAO {

    Connection con = null;
    
    public void createCinema(Cinema cinema) throws SQLException {

        try {
            String sql = "INSERT INTO cinemas(shopping) VALUES(?)";

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            pstm = con.prepareStatement(sql);

            pstm.setString(1, cinema.getShopping());

            pstm.executeUpdate();
            System.out.println("cinema Salvo!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Cinema> getCinemas() {
        
        List<Cinema> cinemas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM cinemas";

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            ResultSet rset = null;

            pstm = con.prepareStatement(sql);

            rset = pstm.executeQuery();

            while(rset.next()) {
                
                Cinema cinema = new Cinema());
                cinema.setId(rset.getInt("id"));
                cinema.setShopping(rset.getString("shopping"));
                cinemas.add(cinema);    
            }
            System.out.println("cinemas Buscados!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cinemas;
    }
    
    public void updatecinema(Cinema cinema) {

        String sql = "UPDATE cinemas SET shopping = ? WHERE id = ?";

        try {

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            pstm = con.prepareStatement(sql);

            pstm.setString(1, cinema.getShopping());
            pstm.setInt(2, cinema.getId());

            pstm.executeUpdate();
            System.out.println("cinema Alterado!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletecinema(int idCinema) {
        String sql = "DELETE FROM cinemas WHERE id = ?";

        try {

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            pstm = con.prepareStatement(sql);

            pstm.setInt(1, idCinema);

            pstm.execute();
            System.out.println("Filme Apagado!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

}
