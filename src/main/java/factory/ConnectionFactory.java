package factory;

import java.sql.*;

public class ConnectionFactory {
    // private Database database;
    //private boolean isConnected = false;

    private static Connection con;


    private static final String USERNAME  = "root";
    private static final String PASSWORD  = "wh0c4r3z";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/CineMais";

    private ConnectionFactory() {
    
    }

    public static Connection getConnection() throws SQLException {
        // Aplicação Singleton//
        try {
            if(con == null) {
                con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            }
            System.out.println("Conexao Estabelecida");
            return con;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}