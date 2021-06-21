package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import factory.ConnectionFactory;
import model.Ingresso;

public class IngressoDAO {

    Connection con = null;
    
    public void createingresso(Ingresso ingresso) throws SQLException {

        try {
            String sql = "INSERT INTO ingressos(dataVenda, cancelado, valor, id_filme, id_sala) VALUES(?, ?, ?, ?, ?)";

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            pstm = con.prepareStatement(sql);

            pstm.setString(1, ingresso.getDataVenda());
            pstm.setInt(2, ingresso.getCancelado());
            pstm.setDouble(3, ingresso.getValor());
            /* pstm.setInt(4, ingresso.getFilme().getId());*/
            pstm.setInt(5, ingresso.getSala().getId());

            pstm.executeUpdate();
            System.out.println("ingresso Salvo!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void updateingresso(Ingresso ingresso) {

    }

    /*public ingresso readingresso(String titulo) {
        return ingresso;        
    }*/

    public void deleteingresso(String ingresso) {

    }
}

