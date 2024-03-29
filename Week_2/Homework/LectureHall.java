import java.util.List;

/**
 *  This class is a type of room. It is used for lectures.
 * @author Tablan Andrei-Razvan
 */

public class LectureHall extends Room {
    /**
     * is the type of the room
     */
    protected String tip="LectureHall";

    /**
     * This is the constructor for a room used for labs.
     * @param name is the name of a room
     * @param cap is the capacity of the room
     * @param Rooms is the list of the available rooms
     */

    public LectureHall(String name, int cap, List<Room> Rooms) {
        super(name, cap, Rooms);
    }
}
