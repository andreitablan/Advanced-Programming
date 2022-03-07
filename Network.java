import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<Node> nodes = new ArrayList<>();
    public Network()
    {

    }
    public void addNode(Node node) {
        nodes.add(node);
    }

    public void afisare()
    {
        for(int index=0;index<nodes.size();index ++)
            System.out.println(" " + nodes.get(index));
    }

    @Override
    public String toString() {
        return "Network{" +
                "nodes=" + nodes +
                '}';
    }

}
