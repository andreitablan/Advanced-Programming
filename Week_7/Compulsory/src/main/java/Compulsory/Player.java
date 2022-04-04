package Compulsory;
import Compulsory.*;
import Compulsory.Tile;

import java.lang.Runnable;
import java.util.List;

import static java.lang.Thread.sleep;

public class Player implements Runnable {
    private String name;

    private Game game;
    private boolean running;
    public Player(String name) { this.name = name; }
    private boolean submitWord() throws InterruptedException {
        List<Tile> extracted = game.getBag().extractTiles(7);
        if (extracted.isEmpty()) {
            return false;
        }
        String word="";
        //create a word with all the extracted tiles;
        game.getBoard().addWord(this, word);
        //make the player sleep 50ms;
        sleep(50);
        return true;
    }

    public void setGame(Game game) {
    }

    @Override
    public void run() {

    }

}