package databases;
import daos.*;
import tools.CSVReader;

import java.sql.SQLException;
import java.util.Scanner;

public class PrincipalManager {
        Database myDatabase=new Database();
        ContinentDAO myContinentDAO=new ContinentDAO();
        CountryDAO myCountryDAO=new CountryDAO();
        CityDAO myCityDAO=new CityDAO();

        public PrincipalManager() throws SQLException{
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                myDatabase.createConnection();

                /**
                 *These are the commands used to create new instances in the databases.
                 myContinentDAO.create(1,"Europe");
                 myContinentDAO.create(2,"Africa");
                 myContinentDAO.create(3,"America");
                 myContinentDAO.create(4,"Australia");
                 myContinentDAO.create(5,"Asia");
                 myContinentDAO.create(6,"Antarctica");
                 myCountryDAO.create(1,"Romania",'RO',"Europe");
                 myCountryDAO.create(2,"Bulgaria",'BG',"Europe");
                 myCountryDAO.create(3,"Egypt",'EG',"Africa");
                 */

                CSVReader myReader=new CSVReader();

                myContinentDAO.findById(1);
                myContinentDAO.findByName("Africa");

                myCountryDAO.findById(2);
                myCountryDAO.findByName("Romania");

                calculateDistance();

                myDatabase.closeConnection();

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    public static double distance(double latitude1, double latitude2, double longitude1, double longitude2)
    {

        longitude1 = Math.toRadians(longitude1);
        longitude2 = Math.toRadians(longitude2);
        latitude1 = Math.toRadians(latitude1);
        latitude2 = Math.toRadians(latitude2);

        double differenceLongitude = longitude2 - longitude1;
        double differenceLatitude = longitude2 - longitude1;
        double answer = Math.pow(Math.sin(differenceLatitude / 2), 2)
                + Math.cos(latitude1) * Math.cos(latitude2)
                * Math.pow(Math.sin(differenceLongitude / 2),2);

        double circumference = 2 * Math.asin(Math.sqrt(answer));

        double radius = 6371;

        return(circumference * radius);
    }

    public void calculateDistance() throws SQLException {
        System.out.println("Va rugam sa dati doua nume de orase");
        Scanner scanner= new Scanner(System.in); //System.in is a standard input stream
        System.out.println("Oras 1: ");
        String cityName1= scanner.nextLine();
        System.out.println("Oras 2: ");
        String cityName2= scanner.nextLine();
        double latitude1=myCityDAO.getCityLatitudeByName(cityName1);
        double longitude1=myCityDAO.getCityLongitudeByName(cityName1);
        double latitude2=myCityDAO.getCityLatitudeByName(cityName2);
        double longitude2=myCityDAO.getCityLongitudeByName(cityName2);
        System.out.println("Distanta intre " + cityName1 +" si " + cityName2 +" este: "+ distance(latitude1,latitude2,longitude1,longitude2) +  " KM");

    }
}
