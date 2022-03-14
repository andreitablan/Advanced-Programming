import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args){
      Network N=new Network();

      Computer V1=new Computer("v1");
      V1.setAddress("1223.12");
      V1.setStorageCapacity(1000);
      N.addNode(V1);

      Router V2=new Router("v2");
      V2.setAddress("1234.11");
      N.addNode(V2);

      Switch V3=new Switch("v3");
      V3.setAddress("1243.23.1");
      N.addNode(V3);

      Computer V4=new Computer("v4");
      V4.setAddress("1223.32.32");
      V4.setStorageCapacity(120);
      N.addNode(V4);

      Computer V5=new Computer("v5");
      V5.setAddress("1223.12.233");
      V5.setStorageCapacity(100);
      N.addNode(V5);

      Computer V6=new Computer("v6");
      V6.setAddress("1223.12.232");
      V6.setStorageCapacity(200);
      N.addNode(V6);
       
      N.printSimpleNodes();

   }
}
