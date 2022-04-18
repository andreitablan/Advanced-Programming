package homework;

/**
 * This represents a letter with its points for the game
 */
public class Tile {
    private final char letter;
    private final int points;

    /**
     * the basic constructor
     * @param letter
     * @param points
     */
    public Tile(char letter, int points) {
        this.letter = letter;
        this.points = points;
    }

    /**
     * Getters and toString method
     */
    public char getLetter() {
        return letter;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "letter=" + letter +
                ", points=" + points +
                '}';
    }
}