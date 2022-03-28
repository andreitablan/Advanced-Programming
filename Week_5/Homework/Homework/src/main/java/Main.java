import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import Catalogs.*;
import Commands.*;
import Exceptions.*;
import Interfaces.*;
import Items.*;


/**
 * This is the main program
 */
public class Main {
    public static void main(String[] args)
    {
        try{FileReader fileReader = new FileReader("src/main/resources/input.txt");
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line = bufferReader.readLine();

            Catalog catalog = new Catalog("carti");
            System.out.println(line);
        }
        catch(IOException exception){
            System.out.println("It did not work");
    }
    }
}