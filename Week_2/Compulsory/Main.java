public class Main {
    public static void main(String[] args)
    {
        Event C1 = new Event("C1", 100, 8, 10);
        Event C2 = new Event("C2", 100, 10, 12);
        Event L1 = new Event("L1", 30, 8, 10);
        Event L2 = new Event("L2", 30, 8, 10);
        Event L3 = new Event("L3", 30, 10, 12);

        System.out.println(C1.toString());
        System.out.println(C2.toString());
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        System.out.println(L3.toString());

        Room R1 = new Room("401", 30,  type.lab);
        Room R2 = new Room("403", 30,  type.lab);
        Room R3 = new Room("405", 30,  type.lab);
        Room R4 = new Room("309", 100,  type.lectureHall);

        System.out.println(R1.toString());
        System.out.println(R2.toString());
        System.out.println(R3.toString());
        System.out.println(R4.toString());

    }
}