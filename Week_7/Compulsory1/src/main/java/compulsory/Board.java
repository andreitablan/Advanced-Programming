package compulsory;

import java.util.*;

public class Board {

    private HashMap<Player, List<String>> words;

    public Board() {
        words = new HashMap<>();
    }

    public synchronized void addWord(Player player, String word) {
        if(!words.containsKey(player)) {
            List newList = new ArrayList<>();
            newList.add(word);
            words.put(player, newList);
        } else {
            words.get(player).add(word);
        }
        System.out.println(player.getName() + ": " + word);
    }

    @Override
    public String toString() {
        return words.toString();
    }
}