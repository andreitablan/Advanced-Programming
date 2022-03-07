import java.util.List;
import java.util.Objects;

/**
 * This class represents an event object.
 * @author Tablan Andrei-Razvan
 */

public class Event {
    private String name;
    private int size;
    private int end;
    private int start;

    /**
     * This is the constructor for an event
     * @param name the name of an event
     * @param size the number of people that will attend
     * @param start the time when it starts
     * @param end the time when it ends
     * @param Events the list of existing events
     */
    public Event(String name, int size, int start, int end, List<Event> Events)
    {
        this.name=name;
        this.size=size;
        this.start=start;
        this.end=end;
    }

    /**
     * Gets the name of an event
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of an event
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The getter for the number of participants
     * @return the number
     */
    public int getSize() {
        return size;
    }

    /**
     * The setter for the number of participants of an event
     * @param size the number of participants
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * The getter for an end time
     * @return the end time
     */
    public int getEnd() {
        return end;
    }

    /**
     * The setter for the end time
     * @param end the end time
     */
    public void setEnd(int end) {
        this.end = end;
    }

    /**
     * The getter for the start time
     * @return the start time
     */
    public int getStart() {
        return start;
    }

    /**
     * The setter for the start time
     * @param start the start time
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     *
     * @return the object in a string format
     */
    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", end=" + end +
                ", start=" + start +
                '}';
    }

    /**
     * this is the method for checking if the object already exists
     * @param o the object
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return getSize() == event.getSize() && getEnd() == event.getEnd() && getStart() == event.getStart() && getName().equals(event.getName());
    }

    /**
     * -
     * @return -
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSize(), getEnd(), getStart());
    }
}