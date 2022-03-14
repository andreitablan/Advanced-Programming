
import java.util.Map;

public class Computer extends Node implements Identifiable, Storage{
    private String address;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     *The method used at sorting
     */
    @Override
    public int compareTo(Node o) {

        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "address='" + address + '\'' +
                ", storageCapacity=" + storageCapacity +
                '}' + '\n';
    }
}
