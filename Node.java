import javax.xml.stream.Location;
import java.util.HashMap;
import java.util.Map;

public class Node {
    private String name,ip;
    /*
    private Map<Node, Integer> cost = new HashMap<>();
     */
    public Node(String nume)
    {
        this.name=nume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public Map<Node, Integer> getCost() {
        return cost;
    }

    public void setCost(Map<Node, Integer> cost) {
        this.cost = cost;
    }

    public void setCost(Node node, int value) {
        cost.put(node, value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Node other) {
        return this.name.compareTo(other.name);
        //not safe, check if name is null before
    }

     */
}