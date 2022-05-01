package compulsory;

import java.sql.*;

/**
 * This class interacts with the table continents.
 */
public class ContinentDAO {
    ContinentDAO () {}

    /**
     * This method inserts into the class attributes.
     * @param id
     * @param name
     * @throws SQLException
     */
    public void create(Integer id, String name) throws SQLException {
        Connection connection = Database.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement("insert into continents (id, name) values (?,?)"))
        {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.execute();
        }
    }

    /**
     * This method finds and prints attributes from the database.
     * @param name
     * @throws SQLException
     */
    public void findByName(String name) throws SQLException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(
                     "select * from continents where name='" + name + "'")) {
            if(rs.next())  System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            else System.out.println("Nu exista acest continent");
        }
    }

    /**
     * This method finds and prints attributes from the database.
     * @param id
     * @throws SQLException
     */
    public void findById(int id) throws SQLException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("select * from continents where id='" + id + "'")) {
            if(rs.next())  System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            else System.out.println("Nu exista acest continent");
        }
    }
}