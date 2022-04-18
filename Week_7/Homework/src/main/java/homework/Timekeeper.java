package homework;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * This class is used for time
 */
public class Timekeeper implements Runnable {

    private final Game game;

    public Timekeeper(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        synchronized (game) {
            do {
                if (game.playerTurn(0) && game.isShowTime()) {
                    game.setShowTime(false);
                    game.notifyAll();
                    game.setPlayerTurn(1);

                } else {
                    try {
                        game.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } while (game.isGameIsOn());
        }
    }

}