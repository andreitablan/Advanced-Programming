
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Network {
    private List<Node> nodes=new ArrayList<>();

     /**
     *The basic constructors for the class.
     */
    public Network(List<Node> nodes) {
        this.nodes = nodes;
    }
    public Network(){}
    
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
     * Print method for Compulsory
     */
    public void printSimpleNodes() {
        for (int index = 0; index < nodes.size(); index++) {
            System.out.println(nodes.get(index).getName());
        }
    }
    
    @Override
    public String toString() {
        return "Network{" +
                "nodes=" + nodes +
                '}' ;
    }
    

}
