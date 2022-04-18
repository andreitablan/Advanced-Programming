package compulsory;
import compulsory.*;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Bag {

    private List<Tile> letters;

    public Bag() {
        Random random = new Random();
        letters = new ArrayList<>();
        for (char c = 'a'; c < 'z'; c++) {
            int value = random.nextInt() % 11;
            for(int index = 0; index < 10; index ++) {
                letters.add(new Tile(c, value));
            }
        }
        Collections.shuffle(letters);
    }

    public synchronized List<Tile> extractTiles(int howMany) {
        List<Tile> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (letters.isEmpty()) {
                break;
            }
            extracted.add(letters.get(i));
            letters.remove(letters.get(i));
        }
        return extracted;
    }

    public List<Tile> getLetters() {
        return letters;
    }

    public void setLetters(List<Tile> letters) {
        this.letters = letters;
    }
}