package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import factory.ConnectionFactory;
import model.Sala;

public class SalaDAO {

    Connection con = null;
    
    public void createsala(Sala sala) throws SQLException {

        try {
            String sql = "INSERT INTO salas(numero, capacidade, is3d) VALUES(?, ?, ?)";

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            pstm = con.prepareStatement(sql);

            pstm.setInt(1, sala.getNumero());
            pstm.setInt(2, sala.getCapacidade());
            pstm.setInt(3, sala.getIs3d());

            pstm.executeUpdate();
            System.out.println("sala Salvo!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void updatesala(Sala sala) {

    }

    /*public sala readsala(String titulo) {
        return sala;        
    }*/

    public void deletesala(String sala) {

    }
}

