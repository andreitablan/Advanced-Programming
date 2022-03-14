
import java.util.Map;

/**
 * This is the class Computer, which is a type of node in our network.
 * @author Tablan Andrei-Razvan
 */
public class Computer extends Node implements Identifiable, Storage{
    private int storageCapacity;

    /**
     *This is the basic constructor for the class
     */
    public Computer(String name) {
        super(name);
    }

    /**
     *Setters and Getters
     */
    @Override
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * This is the Method for all capacities
     */

    public void printAllCapacities() {
        System.out.println("The capacities for the computer " + this.getName() + " are:");
        System.out.println(  this.storageCapacity + " Gigabytes");
        System.out.println(  getStorageCapacityMb() + " Megabytes");
        System.out.println(  getStorageCapacityKb() + " Kilobytes");
        System.out.println( "1000000000 * " + getStorageCapacityB() + " Bytes");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "storageCapacity=" + storageCapacity +
                '}';
    }
}
