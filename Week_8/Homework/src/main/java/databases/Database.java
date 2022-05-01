package databases;

import java.sql.*;

/**
 * This class represents the singleton
 */
public class Database {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "STUDENT";
    private static final String PASSWORD = "STUDENT";
    private static Connection connection = null;

    public Database() throws SQLException{}

    /**
     * This method gets the connection with the database.
     * @return
     */
    public static Connection getConnection() {
        return connection;
    }

    /**
     * this method creates a connection with the database.
     */
    public static void createConnection() {
        try {
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
            System.out.println("Connected!");
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    /**
     * this method closes the connection with the database.
     * @throws SQLException
     */
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    public static void rollback() throws SQLException {
         connection.rollback();

    }
}

