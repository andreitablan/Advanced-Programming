package tools;
import daos.CityDAO;
import daos.ContinentDAO;
import daos.CountryDAO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class reads the csv file.
 */

public class CSVReader {
    CountryDAO myCountryDAO=new CountryDAO();
    CityDAO myCityDAO=new CityDAO();
    int cityID=1;
    int countryID=4;
    private String fileName="src/main/resources/countries.csv";

    public CSVReader() throws FileNotFoundException {

        try (BufferedReader br = Files.newBufferedReader(Paths.get("src/main/resources/countries.csv"), StandardCharsets.ISO_8859_1)) {
            /**
             * read the first line from the text file
             */
             String line = br.readLine();

            while (line != null) {

                String[] attributes = line.split(",");
                String countryName = attributes[0];
                String capitalName = attributes[1];
                float cityLatitude = Float.parseFloat(attributes[2]);
                float cityLongitude = Float.parseFloat(attributes[3]);
                String countryCode = attributes[4];
                String continent = attributes[5];

                /**
                 * myCountryDAO.create(countryID, countryName, countryCode,continent);
                 * myCityDAO.create(cityID,countryName,capitalName,1,cityLatitude,cityLongitude);
                 */

                this.cityID++;
                this.countryID++;
                /**
                 * at the end of the file, line will be null
                 */
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}