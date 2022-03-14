import java.util.HashMap;
import java.util.Map;

public class Intersection {
    private String name;
    private Map<Intersection, Integer> length= new HashMap<>();

    /**
     *The basic constructor for the class
     */
    public Intersection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Map<Intersection, Integer> getCost() {
        return length;
    }

    public void setCost(Intersection node, int value) {
        length.put(node, value);
    }

}
