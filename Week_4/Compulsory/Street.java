import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Street {
    String name;
    int length;
    Intersection a,b;

    public Street(Intersection a,Intersection b,String name, int length) {
        this.name = name;
        this.length = length;
        this.a=a;
        this.b=b;
    }

}
