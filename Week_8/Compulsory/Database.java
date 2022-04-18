package compulsory;

import java.sql.*;

public class Database {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "STUDENT";
    private static final String PASSWORD = "STUDENT";
    private static Connection connection = null;

    private Database() {
    }

    public static Connection getConnection() {
        //TODO
        return connection;
    }

    private static void createConnection() {
        try {
            //Connection = TODO;
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void closeConnection() { //TODO
    }

    public static void rollback() {
    }
}
