package laborator5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This is the main program
 */
public class Main {
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader("src/main/resources/input.txt");
        BufferedReader bufferReader = new BufferedReader(fileReader);
        String line = bufferReader.readLine();
        System.out.println(line);
    }
}
