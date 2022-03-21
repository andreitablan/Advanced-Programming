import java.util.ArrayList;
import java.util.List;

/**
 * This is the Catalog class
 */
public class Catalog implements Serializable {
    private String name;
    private List<Item> items = new ArrayList<>();

    /**
     * this is the basic constructor for a Catalog
     * @param name the name we want for our catalog.
     */
    public Catalog(String name)
    {
        this.name=name;
    }

    /**
     * The item we want to add in our catalog
     * @param item
     */
    public void add(Item item) {
        items.add(item);
    }

    /**
     * this is a method to find an Item in the list of items in a catalog
     * @param id the id we are searching for
     * @return the item itself
     */
    public Item findById(String id) {
        for(int index=0; index<items.size(); index++)
            if(items.get(index).getId().equals(id))
                return items.get(index);
        return null;
    }

    /**
     * this it he toString method required to describe a Catalog.
     * @return the catalog with its items.
     */
    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }

    @Override
    public String getId() {
        return null;
    }
}
