package Catalogs;

import com.fasterxml.jackson.databind.ObjectMapper;
import Exceptions.*;
import java.io.File;
import java.io.IOException;

/**
 * According to Mr. Frasinaru indications I implemented this Class which apply some function to a catalog itself
 */
public class CatalogUtil {
    /**
     * This Function saves a catalog to an external file using JSON format
     * @param catalog the object
     * @param path the path used
     * @throws IOException if it cannot be saved
     */
    public static void save(Catalog catalog, String path)
            throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(path), catalog);
    }

    /**
     * This function loads a catalog from an external JSON file
     * @param path the path to the file
     * @return the catalog
     * @throws InvalidCatalogException if there are exceptions
     * @throws IOException if there are exceptions
     */
    public static Catalog load(String path)
            throws InvalidCatalogException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Catalog catalog = objectMapper.readValue(new File(path), Catalog.class);

        return catalog;
    }
}