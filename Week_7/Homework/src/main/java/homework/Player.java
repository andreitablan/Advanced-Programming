package homework;

import java.lang.Runnable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 *This class represents a player
 */
public class Player implements Runnable {

    private String name;
    private Game game;
    private int numberOfPlayers;
    private int playerNumber;
    private int points=0;
    private String finalWord="";
    private boolean running;
    private List<Tile> playerTiles=new ArrayList<>();
    private int numberTiles=0;
    private int numberTilesToExtract=7;

    /**
     * This is the basic constructor for a player
     * @param name
     * @param game
     * @param numberOfPlayers
     * @param playerNumber
     */
    public Player(String name, Game game, int numberOfPlayers, int playerNumber)
        {
            this.name = name;
            this.playerNumber = playerNumber;
            this.numberOfPlayers = numberOfPlayers;
            this.game = game;
        }

    /**
     * This method verifies if the word is in the dictionary
     * @return
     */
    private boolean submitWord () {
        numberTilesToExtract = 7-numberTiles;
        List<Tile> extracted = game.getBag().extractTiles(7);
        playerTiles.removeAll(playerTiles);
        playerTiles.addAll(extracted);
        if (extracted.isEmpty()) {
            return false;
        }
        finalWord="";
        points=0;

        String  word = getWordFromPlayer(playerTiles);
        if(game.getDictionary().isWord(word)) {
            System.out.print("The word is okay");
            for(int index=0; index<word.length();index++){
                for(Tile tile: playerTiles)
                {
                    if(tile.getLetter() == word.charAt(index))
                        points = points + tile.getPoints();
                        playerTiles.remove(tile);
                        numberTiles++;
                        break;
                    }
                }
            finalWord=word;
        }
        else
        {
            System.out.println("Not a valid word. Sorry.");
            playerTiles.removeAll(playerTiles);
            numberTiles = 0;
        }
        game.getBoard().addWord(this, finalWord, points);
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * This is the class used to generate words
     * @param tiles
     * @return
     */
    private String generateWord (List < Tile > tiles) {

            String word = "";
            for (Tile tile : tiles) {
                word += tile.getLetter();
            }
            return word;
        }

    /**
     * This function will get a word form a player
     * @param tiles
     * @return
     */
    private String getWordFromPlayer(List<Tile> tiles) {

        StringBuilder letters = new StringBuilder();

        for (Tile tile : tiles) {
            letters.append(tile.getLetter());
        }

        String totalLetters = letters.toString();
        System.out.println("The letters available are: " + totalLetters);
        System.out.print("Insert a word: ");
        String playerInputWord = "";

        while (true) {
            boolean theWordIsOk = true;
            StringBuilder remainedLetters = new StringBuilder(letters);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                playerInputWord = reader.readLine().toUpperCase();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int index1 = 0; index1 < playerInputWord.length(); index1++) {
                if (!theWordIsOk) {
                    break;
                }
                for (int index2 = 0; index2 < remainedLetters.length(); index2++) {
                    if (remainedLetters.indexOf(String.valueOf(playerInputWord.charAt(index1))) == -1) {
                        theWordIsOk = false;
                        break;
                    }
                    if (remainedLetters.charAt(index2) == playerInputWord.charAt(index1)) {
                        remainedLetters.deleteCharAt(index2);
                        break;
                    }
                }
            }
            if (theWordIsOk) {
                break;
            }
        }
        return playerInputWord;
    }

    /**
     * This is the run method.
     */
    @Override
        public void run () {
            synchronized (game) {
                while (game.getBag().getTileList().size() >= numberTilesToExtract)
                {
                    if(game.playerTurn(this.playerNumber))
                    {
                        this.submitWord();
                        game.notifyAll();
                    } else {
                        try {
                            game.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            game.setGameIsOn(false);
        }

        public void setGame (Game game){
            this.game = game;
        }

        public String getName() {
           return name;
        }
}