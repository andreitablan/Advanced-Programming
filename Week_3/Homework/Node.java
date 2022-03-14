import java.util.HashMap;
import java.util.Map;

/**
 * This class is representative vor a node.
 * @author Tablan Andrei-Razvan
 */
public abstract class Node implements Comparable<Node>{
    private String name;
    private String address;
    private Map<Node, Integer> cost= new HashMap<>();

    /**
     *The basic constructor for the class
     */
    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<Node, Integer> getCost() {
        return cost;
    }

    public void setCost(Node node, int value) {
        cost.put(node, value);
    }

    /**
     * The function is used to compare two nodes.
     */
    @Override
    public int compareTo(Node o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cost=" + cost +
                '}';
    }
}