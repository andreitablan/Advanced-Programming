import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class City {
    private String name;
    List<Intersection> nodeList = new ArrayList<>();
    Map<Intersection, List<Street>> cityMap = new HashMap<>();

    public City() {}

    public void addIntersection(Intersection node){
        this.nodeList.add(node);
    }




}
