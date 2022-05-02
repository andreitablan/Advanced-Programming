package daos;

import databases.Database;

import java.sql.*;

/**
 * This class interacts with the table countries.
 */
public class CountryDAO {

    public CountryDAO() {}

    /**
     * This method inserts into the table values.
     * @param id
     * @param name
     * @param code
     * @param continent
     * @throws SQLException
     */
    public void create(Integer id,String name, String code, String continent) throws SQLException {
        Connection connection = Database.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement("insert into countries (ID,NAME,CODE,CONTINENT) values (?,?,?,?)"))
        {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, code);
            preparedStatement.setString(4, continent);

            preparedStatement.execute();
        }
    }

    /**
     * This method prints find and prints attributes from the database.
     * @param name
     * @throws SQLException
     */
    public void findByName(String name) throws SQLException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(
                     "select * from countries where name='" + name + "'")) {
            if(rs.next())  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
            else System.out.println("Nu exista aceasta tara");
        }
    }

    /**
     * This method prints find and prints attributes from the database.
     * @param id
     * @throws SQLException
     */
    public void findById(int id) throws SQLException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("select * from countries where id='" + id + "'")) {
            if(rs.next())  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4));
            else System.out.println("Nu exista aceasta tara");
        }
    }
}