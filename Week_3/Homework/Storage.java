/**
 * This is the interface Storage.
 * @author Tablan Andrei-Razvan
 */
public interface Storage {
    int getStorageCapacity();

    default int getStorageCapacityMb() {
        int capacity=getStorageCapacity();
        return 1024*capacity;
    }
    default long getStorageCapacityKb() {
        int capacity=getStorageCapacity();
        return 1000000*capacity;
    }
    default long getStorageCapacityB() {
        int capacity=getStorageCapacity();
        return capacity;
    }
}
