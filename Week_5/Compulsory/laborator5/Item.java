package laborator5;

import java.io.Serializable;

public class Item implements Serializable, laborator5.Identify {
    private String id;
    private String title;
    private String location;
    private String author;
    private int year;
    private String description;

    /**
     * Setters and Getters for all the items in this class
     */

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *toString Method
     */
    @Override
    public String toString() {
        return id + " " + title;
    }
}
