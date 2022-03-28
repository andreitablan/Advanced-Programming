package laborator5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the Catalog class
 */
public class Catalog implements Serializable {
    private String name;
    private List<Item> items = new ArrayList<>();

    /**
     *Constructor for a catalog
     */
    public Catalog(String name) {
        this.name = name;
    }

    /**
     *Setter for the name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the name
     * @param name the name of the Catalog
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *This function adds an item to the items list
     */
    public void add(Item item) {
        items.add(item);
    }

    /**
     *This function search for an object by its id and returns the object
     */
    public Item findById(String id) {
        return items.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }
    /**
     *This is the toString method
     */
    @Override
    public String toString() {
        return "Catalog{" +
                "items=" + items +
                '}';
    }
}
