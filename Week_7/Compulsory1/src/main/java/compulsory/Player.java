package compulsory;

import java.lang.Runnable;
import java.util.List;

import static java.lang.Thread.sleep;

public class Player implements Runnable {

    //The player has a name, the game he is in and a boolean attribute to say if he plays or not
    private String name;
    private Game game;
    private boolean running;

    public Player(String name) { this.name = name; }

    private boolean submitWord(){
        List<Tile> extracted = game.getBag().extractTiles(7);
        if (extracted.isEmpty()) {
            return false;
        }
        String word=generateWord(extracted);
        //create a word with all the extracted tiles;
        game.getBoard().addWord(this, word);
        //make the player sleep 50ms;
        try {
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return true;
    }

    private String generateWord(List<Tile> tiles) {
        String word = "";
        for (Tile tile : tiles) {
            word += tile.getLetter();
        }
        return word;
    }

    @Override
    public void run() {
        this.submitWord();
    }

    public void setGame(Game game) {
        this.game=game;    }

    public String getName() {
        return name;
    }
}