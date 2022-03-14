import java.util.ArrayList;
import java.util.List;
/**
 * This is the main Class.
 * @author Tablan Andrei-Razvan
 */
public class Main {
   public static void main(String[] args){
      Network N=new Network();

      Computer V1=new Computer("v1");
      V1.setAddress("33.172.46.13");
      V1.setStorageCapacity(100);
      N.addNode(V1);

      Router V2=new Router("v2");
      V2.setAddress("252.37.170.208");
      N.addNode(V2);

      Switch V3=new Switch("v3");
      V3.setAddress("159.218.44.132");
      N.addNode(V3);

      Computer V4=new Computer("v4");
      V4.setAddress("153.30.247.245");
      V4.setStorageCapacity(300);
      N.addNode(V4);

      Computer V5=new Computer("v5");
      V5.setAddress("167.92.77.67");
      V5.setStorageCapacity(200);
      N.addNode(V5);

      Computer V6=new Computer("v6");
      V6.setAddress("124.44.150.132");
      V6.setStorageCapacity(250);
      N.addNode(V6);

      V1.setCost(V2,10);
      V1.setCost(V3,50);
      V2.setCost(V3,20);
      V2.setCost(V4,20);
      V2.setCost(V5,10);
      V3.setCost(V4,20);
      V4.setCost(V5,30);
      V4.setCost(V6,10);
      V4.setCost(V6,20);

      N.sort();

      System.out.println("This is the compulsory");
      N.printSimpleNodes();

      System.out.println("This is the first exercise in Homework");
      N.printMap();

      System.out.println("This is the second exercise in Homework, the one with capacities");
      V6.printAllCapacities();
      V5.printAllCapacities();
      V4.printAllCapacities();

      System.out.println("This is the third exercise in Homework, the IP ADDRESS sorting");
      N.printAndSortByAddress();

      System.out.println("This is the last exercise in Homework, the algorithm");
      Algorithm A=new Algorithm(N.getNodes());
   }
}
