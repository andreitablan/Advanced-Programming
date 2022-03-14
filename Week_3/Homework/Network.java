
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This Class represents the network of nodes.
 * @author Tablan Andrei-Razvan
 */

public class Network {
    private List<Node> nodes=new ArrayList<>();

     /**
     *The basic constructor for the class.
     */
    public Network() {

    }

    public List<Node> getNodes() {
        return nodes;
    }
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    /**
     * Add a node method.
     */
    public void addNode(Node node){
        this.nodes.add(node);
    }

    /**
     * Sort method by names.
     */
    public void sort(){
        Collections.sort(this.nodes);
    }

    /**
     * This is the last method in the homework, print the nodes sorted by IP ADDRESS
     */
    public void printAndSortByAddress(){
        for (int index = 0; index < nodes.size(); index++) {
            for (int index1 = index + 1; index1 < nodes.size(); index1++) {
                if (nodes.get(index).getAddress().compareTo(nodes.get(index1).getAddress()) > 0) {
                    Collections.swap(nodes, index, index1);
                }
            }
        }

        for (int index = 0; index < nodes.size(); index++) {

            System.out.println(nodes.get(index).getName() +" " + nodes.get(index).getAddress());
        }

    }

    /**
     * Print method for Compulsory
     */
    public void printSimpleNodes() {
        for (int index = 0; index < nodes.size(); index++) {
            System.out.println(nodes.get(index).getName());
        }
    }

    /**
     * Print method for Homework
     */
    public void printMap() {
        for (int index = 0; index < nodes.size(); index++) {
                for(Node key : nodes.get(index).getCost().keySet()){

                    System.out.println(nodes.get(index).getName() + "--" +key.getName() + ":" +  String.valueOf(nodes.get(index).getCost().get(key)));
                }
        }
    }

    @Override
    public String toString() {
        return "Network{" +
                "nodes=" + nodes +
                '}';
    }
}
