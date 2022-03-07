public class Main {
    public static void main(String[] args)
    {
       Network Net= new Network();
       Node V1=new Node("V1");
       Node V2=new Node("V2");
       Node V3=new Node("V3");
       Node V4=new Node("V4");
       Node V5=new Node("V5");
       Node V6=new Node("V6");

       Net.addNode(V1);
       Net.addNode(V2);
       Net.addNode(V3);
       Net.addNode(V4);
       Net.addNode(V5);
       Net.addNode(V6);

       Net.afisare();
    }
}
