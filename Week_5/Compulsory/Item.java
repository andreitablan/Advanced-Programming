import java.util.HashMap;
import java.util.Map;

/**
 * This is the Item class.
 */
public class Item implements Serializable {
    private String id;
    private String title;
    private String location; //file name or Web page

    private Map<String, Object> tags = new HashMap<>();

    /**
     * the basic constructor for an item
     * @param title sets the title of an item
     */
    public Item(String title)
    {
        this.title=title;
    }

    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }

    /**
     * This are getters for the atributes of an Item
     */
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public Map<String, Object> getTags() {
        return tags;
    }
}
