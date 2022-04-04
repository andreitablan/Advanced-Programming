package Compulsory;
import Compulsory.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

public class Board {
   // private final a collection for words;
    final Collection<String> words = new LinkedList<String>();
    //private Set<String> wordSet;

    public void addWord(Player player, String word)
    {   this.words.add(word);
        //System.out.println(player.getName() + ": " + word);
    }
    @Override
    public String toString() {
        return words.toString();
    }
}