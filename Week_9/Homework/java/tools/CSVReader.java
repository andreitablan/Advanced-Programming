package tools;

import entity.City;
import repositories.CityRepository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * This class reads a big number of cities.
 */
public class CSVReader {
    long cityID = 320000;

    public CSVReader() throws FileNotFoundException {

        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("src/main/resources/countries1.csv"), StandardCharsets.ISO_8859_1)) {
            String line = bufferedReader.readLine();

            while (line != null) {

                String[] attributes = line.split(",");
                String countryName = attributes[0];
                String capitalName = attributes[1];
                double cityLatitude = Float.parseFloat(attributes[2]);
                double cityLongitude = Float.parseFloat(attributes[3]);

                City city = new City();
                city.setId(cityID);
                city.setCapital(1L);
                city.setCountry(countryName);
                city.setName(capitalName);
                city.setLatitude(cityLatitude);
                city.setLongitude(cityLongitude);

                CityRepository cityRepository = new CityRepository();
                cityRepository.persist(city);

                this.cityID++;
                line = bufferedReader.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}