package compulsory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

/**
 * This is the main class.
 */
public class Main {
    public static void main(String args[]) throws SQLException {
        Database myDatabase=new Database();
        ContinentDAO myContinentDAO=new ContinentDAO();
        CountryDAO myCountryDAO=new CountryDAO();

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            myDatabase.createConnection();


            /**
            *These are the commands used to create new instances in the databases.
            myContinentDAO.create(1,"Europe");
            myContinentDAO.create(2,"Africa");
            myCountryDAO.create(1,"Romania",202,"Europe");
            myCountryDAO.create(2,"Bulgaria",203,"Europe");
            myCountryDAO.create(3,"Egypt",501,"Africa");
            */

            myContinentDAO.findById(1);
            myContinentDAO.findByName("Africa");

            myCountryDAO.findById(2);
            myCountryDAO.findByName("Romania");

            myDatabase.closeConnection();

        }catch(Exception e){ System.out.println(e);}

    }

}