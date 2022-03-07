import java.util.List;

/**
 * This is the Class Problem. It describes the objects used in the problem.
 * @author Tablan Andrei-Razvan
 */

public class Problem {

    /**
     * In this constructor we write on the screen the instances of the problem.
     * @param Events are the events that exists.
     * @param Rooms are the rooms that are available.
     */
    public Problem(List<Event> Events, List<Room> Rooms) {
    for(int index=0; index<Events.size(); index++)
        System.out.println(Events.get(index).toString());

    for(int index=0; index<Rooms.size(); index++)
        System.out.println(Rooms.get(index).toString());
    }
}
