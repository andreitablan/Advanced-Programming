package Items;
import Interfaces.Identify;
import java.io.Serializable;

/**
 * This class represents an item in a catalog.
 */
public class Item implements Serializable, Interfaces.Identify {
    private String id;
    private String title;
    private String location;
    private String author;
    private int year;
    private String description;


    /**
     * Getter for the Id
     * @return
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Setter for the Id
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for the Title
     * @return
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * Setter for the Title
     */
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for the location
     * @return
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     * setter for the location
     * @param location
     */
    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * getter for the author
     * @return
     */
    public String getAuthor() {
        return author;
    }

    /**
     * setter for the author
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * getter for the year
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     * setter for the year
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * getter for the Descriprion
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter for the description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                '}';
    }
}
