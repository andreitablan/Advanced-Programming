package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * The bag of letters for the game
 */
public class Bag {

    /**
     * This is the list of letters we can build with
     */
    private List<Tile> tileList;

    /**
     * The basic constructor for the game
     */
    public Bag() {
        tileList = new ArrayList<>();
        for (char c = 'A'; c < 'Z'; c++) {
            int numerOfTiles = 0;
            switch (c) {
                case 'A' -> numerOfTiles = 9;
                case 'B' -> numerOfTiles = 2;
                case 'C' -> numerOfTiles = 2;
                case 'D' -> numerOfTiles = 4;
                case 'E' -> numerOfTiles = 12;
                case 'F' -> numerOfTiles = 2;
                case 'G' -> numerOfTiles = 3;
                case 'H' -> numerOfTiles = 2;
                case 'I' -> numerOfTiles = 9;
                case 'J' -> numerOfTiles = 1;
                case 'K' -> numerOfTiles = 1;
                case 'L' -> numerOfTiles = 4;
                case 'M' -> numerOfTiles = 2;
                case 'N' -> numerOfTiles = 6;
                case 'O' -> numerOfTiles = 8;
                case 'P' -> numerOfTiles = 2;
                case 'Q' -> numerOfTiles = 1;
                case 'R' -> numerOfTiles = 6;
                case 'S' -> numerOfTiles = 4;
                case 'T' -> numerOfTiles = 6;
                case 'U' -> numerOfTiles = 4;
                case 'V' -> numerOfTiles = 2;
                case 'W' -> numerOfTiles = 2;
                case 'X' -> numerOfTiles = 1;
                case 'Y' -> numerOfTiles = 2;
                case 'Z' -> numerOfTiles = 1;
                default -> numerOfTiles = 0;
            }
            for (int index = 0; index < numerOfTiles; index++) {
                switch (c) {
                    case 'A' -> tileList.add(new Tile(c, 1));
                    case 'B' -> tileList.add(new Tile(c, 3));
                    case 'C' -> tileList.add(new Tile(c, 3));
                    case 'D' -> tileList.add(new Tile(c, 2));
                    case 'E' -> tileList.add(new Tile(c, 1));
                    case 'F' -> tileList.add(new Tile(c, 4));
                    case 'G' -> tileList.add(new Tile(c, 2));
                    case 'H' -> tileList.add(new Tile(c, 4));
                    case 'I' -> tileList.add(new Tile(c, 1));
                    case 'J' -> tileList.add(new Tile(c, 8));
                    case 'K' -> tileList.add(new Tile(c, 5));
                    case 'L' -> tileList.add(new Tile(c, 1));
                    case 'M' -> tileList.add(new Tile(c, 3));
                    case 'N' -> tileList.add(new Tile(c, 1));
                    case 'O' -> tileList.add(new Tile(c, 1));
                    case 'P' -> tileList.add(new Tile(c, 3));
                    case 'Q' -> tileList.add(new Tile(c, 10));
                    case 'R' -> tileList.add(new Tile(c, 1));
                    case 'S' -> tileList.add(new Tile(c, 1));
                    case 'T' -> tileList.add(new Tile(c, 1));
                    case 'U' -> tileList.add(new Tile(c, 1));
                    case 'V' -> tileList.add(new Tile(c, 4));
                    case 'W' -> tileList.add(new Tile(c, 4));
                    case 'X' -> tileList.add(new Tile(c, 8));
                    case 'Y' -> tileList.add(new Tile(c, 4));
                    case 'Z' -> tileList.add(new Tile(c, 10));
                    default -> numerOfTiles = 0;
                }
            }
        }
        Collections.shuffle(tileList);
    }

    /**
     * This method extracts tiles from the bag
     * @param howMany
     * @return
     */
    public synchronized List<Tile> extractTiles(int howMany) {

        List<Tile> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (tileList.isEmpty()) {
                break;
            }
            extracted.add(tileList.get(i));
            tileList.remove(tileList.get(i));
        }
        return extracted;
    }

    public List<Tile> getTileList() {
        return tileList;
    }

    public void setTileList(List<Tile> tileList) {
        this.tileList = tileList;
    }
}