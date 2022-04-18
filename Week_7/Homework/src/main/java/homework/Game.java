package homework;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This is the game class
 */
public class Game {
    private final Bag bag = new Bag();
    private final Board board = new Board();
    private final MockDictionary dictionary = new MockDictionary();
    private final List<Player> players = new ArrayList<>();
    private int playerTurn = 1;
    private final int numberOfTiles = 7;
    private boolean gameIsOn = true;
    private long beginningTime;
    private boolean showTime = false;

    /**
     * This method should add a player to the game
     * @param player
     */
    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }

    /**
     * This method starts the game
     */
    public void play() {
        System.out.println("The game has started");
        beginningTime = System.currentTimeMillis();

        for (Player player : players) {
            Thread newThread = new Thread(player);
            newThread.start();
        }
        Thread newThread = new Thread(new Timekeeper(this));
        newThread.setDaemon(true);
        newThread.start();
    }

    /**
     * This method represents the player turn
     * @param player
     * @return
     */
    public boolean playerTurn(int player) {
        return player == playerTurn;
    }

    /**
     * This is the main method
     * @param args
     * @throws InterruptedException
     */
    public static void main(String args[]) throws InterruptedException {
        String name;
        Game game = new Game();
        System.out.println("Welcome to the word game");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please state the number of players: ");
        int numberOfPlayers = scan.nextInt();

        System.out.println("Please give each player a name:");
        for (int index = 1; index <= numberOfPlayers; index++) {
            System.out.print("Player " + index + " is : ");
            Scanner input = new Scanner(System.in);
            name = input.nextLine();
            game.addPlayer(new Player(name, game, numberOfPlayers, index));
        }
        game.play();

        while (game.gameIsOn) {
            Thread.sleep(5000);
        }
        long duration = System.currentTimeMillis();
        System.out.println(game.board);
        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.println("The game lasted: " + decimal.format((duration - game.getBeginningTime()) / 1000) + " s");
    }

    public Bag getBag() {
        return bag;
    }

    public Board getBoard() {
        return board;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }

    public int getNumberOfTiles() {
        return numberOfTiles;
    }

    public boolean isGameIsOn() {
        return gameIsOn;
    }


    public long getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(long beginningTime) {
        this.beginningTime = beginningTime;
    }

    public void setGameIsOn(boolean gameIsOn) {
        this.gameIsOn = gameIsOn;
    }

    public MockDictionary getDictionary() {
        return (MockDictionary) dictionary;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public boolean isShowTime() {
        return showTime;
    }

    public void setShowTime(boolean showTime) {
        this.showTime = showTime;
    }
}