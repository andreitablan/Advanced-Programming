import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        City Cluj=new City();

        /*
        var nodes = IntStream.rangeClosed(0, 8)
                .mapToObj(i -> new Intersection("v" + i) )
                .toArray(Intersection[]::new);

        for (Intersection v : Cluj.nodeList) {
            Cluj.nodeList.add(v);
        }
        */

        Intersection V0 = new Intersection("v0");
        Cluj.nodeList.add(V0);
        Intersection V1 = new Intersection("v1");
        Cluj.nodeList.add(V1);
        Intersection V2 = new Intersection("v2");
        Cluj.nodeList.add(V2);
        Intersection V3 = new Intersection("v3");
        Cluj.nodeList.add(V3);
        Intersection V4 = new Intersection("v4");
        Cluj.nodeList.add(V4);
        Intersection V5 = new Intersection("v5");
        Cluj.nodeList.add(V5);
        Intersection V6 = new Intersection("v6");
        Cluj.nodeList.add(V6);
        Intersection V7 = new Intersection("v7");
        Cluj.nodeList.add(V7);
        Intersection V8 = new Intersection("v8");
        Cluj.nodeList.add(V8);

        Street A=new Street(Cluj.nodeList.get(0),Cluj.nodeList.get(1),"street1",2 );
        Street B=new Street(Cluj.nodeList.get(0),Cluj.nodeList.get(7),"street2",2 );
        Street C=new Street(Cluj.nodeList.get(0),Cluj.nodeList.get(6),"street3",2 );
        Street D=new Street(Cluj.nodeList.get(1),Cluj.nodeList.get(2),"street4",3 );
        Street E=new Street(Cluj.nodeList.get(1),Cluj.nodeList.get(7),"street5",2 );
        Street F=new Street(Cluj.nodeList.get(7),Cluj.nodeList.get(8),"street6",2 );
        Street G=new Street(Cluj.nodeList.get(7),Cluj.nodeList.get(6),"street7",1 );
        Street H=new Street(Cluj.nodeList.get(7),Cluj.nodeList.get(5),"street8",2 );
        Street I=new Street(Cluj.nodeList.get(6),Cluj.nodeList.get(6),"street9",3 );
        Street J=new Street(Cluj.nodeList.get(2),Cluj.nodeList.get(3),"street10",1 );
        Street K=new Street(Cluj.nodeList.get(2),Cluj.nodeList.get(5),"street11",1 );
        Street L=new Street(Cluj.nodeList.get(8),Cluj.nodeList.get(3),"street12",1 );
        Street M=new Street(Cluj.nodeList.get(8),Cluj.nodeList.get(4),"street13",1 );
        Street N=new Street(Cluj.nodeList.get(5),Cluj.nodeList.get(4),"street14",3 );
        Street O=new Street(Cluj.nodeList.get(3),Cluj.nodeList.get(4),"street15",1 );


    }
}
