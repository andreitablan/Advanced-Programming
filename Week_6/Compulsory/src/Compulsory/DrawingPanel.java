package Compulsory;

import Compulsory.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

/**
 * This is the class for the Canvas
 */
public class DrawingPanel extends JPanel {
    final MainFrame frame;
    int canvasWidth = 400, canvasHeight = 400;
    int rows, cols;
    int boardWidth, boardHeight;
    int cellWidth, cellHeight;
    int padX, padY;
    int stoneSize = 20;

    BufferedImage image; //the offscreen image
    Graphics2D offscreen; //the offscreen graphics, tools needed to draw the images

    /**
     * This is the main constructor
     * @param frame
     */
    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        createOffscreenImage();
        init(frame.configPanel.getRows(), frame.configPanel.getCols());
    }

    /**
     * This function should create an offscreen image
     */
    private void createOffscreenImage() {
        image = new BufferedImage(canvasWidth, canvasHeight, BufferedImage.TYPE_INT_ARGB);
        offscreen = image.createGraphics();
        offscreen.setColor(Color.WHITE); //fill the image with white
        offscreen.fillRect(0, 0, canvasWidth, canvasHeight);
    }

    /**
     * This is the function for initiation
     * @param rows
     * @param cols
     */
    private void init(int rows, int cols) {
        setPreferredSize(new Dimension(canvasWidth, canvasHeight));
        setBorder(BorderFactory.createEtchedBorder());

        this.rows=frame.configPanel.getRows();
        this.cols=frame.configPanel.getCols();
        this.padX = stoneSize + 10;
        this.padY = stoneSize + 10;
        this.cellWidth = (canvasWidth - 2 * padX) / (cols - 1);
        this.cellHeight = (canvasHeight - 2 * padY) / (rows - 1);
        this.boardWidth = (cols - 1) * cellWidth;
        this.boardHeight = (rows - 1) * cellHeight;

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                drawStone(e.getX(), e.getY());
                repaint();
            }
            //Can’t use lambdas, JavaFX does a better job in these cases
        });
    }

    /**
     * This function Draws on the Grid the matrix
     * @param graphics2D
     */
    private void paintGrid(Graphics2D graphics2D) {
        graphics2D.setColor(Color.DARK_GRAY);
        //horizontal lines
        for (int row = 0; row < rows; row++) {
            int x1 = padX;
            int y1 = padY + row * cellHeight;
            int x2 = padX + boardWidth;
            int y2 = y1;
            graphics2D.drawLine(x1, y1, x2, y2);
        }
        //vertical lines
        for (int col = 0; col < cols; col++) {
            int x1 = padX + col * cellWidth;
            int y1 = padY;
            int x2 = x1;
            int y2 = padY + boardHeight;
            graphics2D.drawLine(x1, y1, x2, y2);
        }
        //intersections
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int x = padX + col * cellWidth;
                int y = padY + row * cellHeight;
                graphics2D.setColor(Color.LIGHT_GRAY);
                graphics2D.drawOval(x - stoneSize / 2, y - stoneSize / 2, stoneSize, stoneSize);
            }
        }

    }

    /**
     * This function draws paint the component using graphics2D
     * @param graphics
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = image.createGraphics();
        paintGrid(graphics2D);
        graphics.drawImage(image, 0, 0, this);

    }

    /**
     * This function draws a stone on the board
     * @param x
     * @param y
     */
    private void drawStone(int x, int y) {

        offscreen.setColor(Color.WHITE);
    }
}
