package homework;

import java.util.Dictionary;
import java.util.Enumeration;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * this Class imports a dictionary
 */
public class MockDictionary extends Dictionary {

    List<String> dictionaryOfWords;

    /**
     * the basic constructor for this class
     */

    public MockDictionary() {
        dictionaryOfWords = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File("src/main/resources/dictionary.txt"));
            while (input.hasNext()){
                dictionaryOfWords.add(input.next().toUpperCase());
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * This verifies if the word exists in the dictionary
     * @param string
     * @return
     */
    public boolean isWord(String string) {
        return dictionaryOfWords.contains(string);
    }

    public List<String> getDictionaryOfWords() {
        return dictionaryOfWords;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Enumeration keys() {
        return null;
    }

    @Override
    public Enumeration elements() {
        return null;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }
}