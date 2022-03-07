import java.util.List;
import java.util.Objects;

/**
 * This class represents a room object.
 * @author Tablan Andrei-Razvan
 */

abstract class Room {
    private String name;
    private int cap;


    /**
     *
     * @param name represents the name of the room
     * @param cap is the capacity of the room
     * @param Rooms is the list of the existing rooms
     */
    public Room(String name, int cap, List<Room> Rooms) {

        this.name=name;
        this.cap = cap;

    }

    /**
     * This method gets the name of a room
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets a name of a room
     * @param name is the name that we may set for one room
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the capacity of a room
     * @return the capacity of a room
     */
    public int getCap() {
        return cap;
    }

    /**
     * Sets the capacity of a room
     * @param cap the capacity we want to set for a room
     */
    public void setCap(int cap) {
        this.cap = cap;
    }

    /**
     * This method returns in the string format the object room
     * @return an object room
     */
    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", cap=" + cap +
                '}';
    }

    /**
     * This function checks if a new object already exists
     * @param o is the object
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return getCap() == room.getCap() && getName().equals(room.getName());
    }

    /**
     * Hashcode
     * @return -
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCap());
    }
}