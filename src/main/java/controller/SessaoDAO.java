package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import factory.ConnectionFactory;
import model.Sessao;

public class SessaoDAO {

    Connection con = null;
    
    public void createsessao(Sessao sessao) throws SQLException {

        try {
            String sql = "INSERT INTO sessoes(horario, dia, id_filme, ocupacao, numSala) VALUES(?, ?, ?, ?, ?)";

            con = ConnectionFactory.getConnection();

            PreparedStatement pstm = null;

            pstm = con.prepareStatement(sql);

            pstm.setString(1, sessao.getHorario());
            pstm.setString(2, sessao.getDia());
            pstm.setInt(3, sessao.getFilme().getId());
            pstm.setInt(4, sessao.getOcupacao());
            pstm.setInt(5, sessao.getNumSala());

            pstm.executeUpdate();
            System.out.println("sessao Salvo!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void updatesessao(Sessao sessao) {

    }

    /*public sessao readsessao(String titulo) {
        return sessao;        
    }*/

    public void deletesessao(String sessao) {

    }
}

