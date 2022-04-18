package homework;

import java.util.*;
import java.util.HashMap;
import java.util.List;

/**
 * This board counts the players points
 */
public class Board {

    private HashMap<Player, List<String>> formedWords;

    private HashMap<String, Integer> playerScore;

    /**
     * The basic constructor for this class
     */
    public Board() {
        formedWords = new HashMap<>();
        playerScore = new HashMap<>();
    }

    /**
     * The method which add the word and the score for a specific player
     * @param player
     * @param word
     * @param newScore
     */
    public synchronized void addWord(Player player, String word, int newScore) {
        if(!formedWords.containsKey(player)) {
            List newListOfWords = new ArrayList<>();
            newListOfWords.add(word);
            formedWords.put(player, newListOfWords);
        } else {
            formedWords.get(player).add(word);
        }
        System.out.println( player.getName() + " : " + word);

        int existingScore = 0;
        if (!playerScore.containsKey(player)) {
            playerScore.put(player.getName(), newScore);
            existingScore = newScore;
        } else {
            existingScore = playerScore.get(player);
            existingScore = existingScore + newScore;
            playerScore.put(player.getName(), existingScore);
        }
    }


    @Override
    public String toString() {
        return "Board{" +
                "playerScore=" + playerScore +
                '}';
    }
}
