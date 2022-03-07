import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *This is the main class
 *@author Tablan Andrei-Razvan
 */

public class Main {
    /**
     * This is the main function
     * @param args are the arguments
     */
    public static void main(String[] args)
    {

        List<Event> Events;
        Events=new ArrayList<>();

        /*Crearea evenimentelor*/
        Event C1 = new Event("C1", 100, 8, 10, Events);
        if(C1.equals(C1)) {
            Events.add(C1);
        }
        Event C2 = new Event("C2", 100, 10, 12, Events);
        if(C2.equals(C2)) {
            Events.add(C2);
        }
        Event L1 = new Event("L1", 30, 8, 10, Events);
        if(L1.equals(L1)) {
            Events.add(L1);
        }
        Event L2 = new Event("L2", 30, 8, 10, Events);
        if(L2.equals(L2)) {
            Events.add(L2);
        }
        Event L3 = new Event("L3", 30, 10, 12, Events);
        if(L3.equals(L3)) {
            Events.add(L3);
        }
        Event L4 = new Event("C1", 100, 8, 10, Events);
        if(!L4.equals(L4)) {
            Events.add(L4);
        }

        List<Room> Rooms;
        Rooms=new ArrayList<>();

        /*Crearea camerelor*/
        ComputerLab R1 = new ComputerLab("401", 30, Rooms);
        if(R1.equals(R1)) {
            Rooms.add(R1);
        }
        ComputerLab R2 = new ComputerLab("403", 30, Rooms);
        if(R2.equals(R2)) {
            Rooms.add(R2);
        }
        ComputerLab R3 = new ComputerLab("405", 30, Rooms);
        if(R3.equals(R3)) {
            Rooms.add(R3);
        }
        LectureHall R4 = new LectureHall("309", 100, Rooms);
        if(R4.equals(R4)) {
            Rooms.add(R4);
        }

        Problem P1=new Problem(Events, Rooms);
    }
}