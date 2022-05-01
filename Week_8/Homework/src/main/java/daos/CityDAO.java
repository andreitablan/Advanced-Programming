package daos;

import databases.Database;

import java.sql.*;
/**
 * This class interacts with the table cities.
 */
public class CityDAO {


    /**
     * This method inserts into the table values.
     * @throws SQLException
     */
    public void create(Integer id,String country, String name, Integer capital, Float latitude, Float longitude) throws SQLException {
        Connection connection = Database.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement("insert into cities (ID, COUNTRY, NAME, CAPITAL, LATITUDE, LONGITUDE) values (?,?,?,?,?,?)"))
        {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, country);
            preparedStatement.setString(3, name);
            preparedStatement.setInt(4, capital);
            preparedStatement.setFloat(5, latitude);
            preparedStatement.setFloat(6, longitude);
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
                     "select * from cities where name='" + name + "'")) {
            if(rs.next())  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
            else System.out.println("Nu exista acest oras");
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
             ResultSet rs = statement.executeQuery("select * from cities where id='" + id + "'")) {
            if(rs.next())  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
            else System.out.println("Nu exista aceast oras");
        }
    }

    /**
     * This method gets the latitude of a city using the city name.
     */
    public Double getCityLatitudeByName(String name) throws SQLException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(
                     "select latitude from cities where name='" + name + "'")) {
            if(rs.next())  return rs.getDouble(1);
            else System.out.println("Nu exista acest oras");
        }
        return null;
    }

    /**
     * This method gets the longitude using the city name.
     */
    public Double getCityLongitudeByName(String name) throws SQLException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(
                     "select longitude from cities where name='" + name + "'")) {
            if(rs.next())  return rs.getDouble(1);
            else System.out.println("Nu exista acest oras");
        }
        return null;
    }
}