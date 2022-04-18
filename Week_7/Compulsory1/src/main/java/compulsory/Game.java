package compulsory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Dictionary;


public class Game {
    private final Bag bag = new Bag();
    private final Board board = new Board();
    private final Dictionary dictionary = new MockDictionary();
    private final List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }
    public void play() {
        System.out.println("The game has started");

        List<Thread> threads = new ArrayList<>();
        for (Player player : players) {

            System.out.println("We made a thread for the player named " + player.getName() );
            Thread newThread = new Thread(player);
            threads.add(newThread);
        }
        while (bag.getLetters().size() > 20) {
            for (Thread thread : threads) {
                //thread.start();
                thread.run();
            }
        }
    }
    public static void main(String args[]) {
        String name;
        Game game = new Game();
        System.out.println("Welcome to the word game");
        System.out.println("We got room for three players, so please state your names:");
        System.out.print("Player 1:");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        game.addPlayer(new Player(name));


        System.out.print("Player 2:");
        Scanner inp = new Scanner(System.in);
        name = inp.nextLine();
        game.addPlayer(new Player(name));

        System.out.print("Player 3:");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        game.addPlayer(new Player(name));

        game.play();
    }

    public Bag getBag() {
        return bag;
    }

    public Board getBoard() {
        return board;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public List<Player> getPlayers() {
        return players;
    }
}