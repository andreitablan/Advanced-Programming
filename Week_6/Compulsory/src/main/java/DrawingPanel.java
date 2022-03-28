import javafx.scene.paint.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static java.awt.Color.WHITE;

public class DrawingPanel extends JPanel {
    final MainFrame frame;
    int canvasWidth = 400, canvasHeight = 400;

    BufferedImage image; //the offscreen image
    Graphics2D offscreen; //the offscreen graphics
    public DrawingPanel(MainFrame frame) {
        this.frame = frame; createOffscreenImage();
    }
    private void createOffscreenImage() {
        image = new BufferedImage(
                canvasWidth, canvasHeight, BufferedImage.TYPE_INT_ARGB);
        offscreen = image.createGraphics();
        offscreen.setColor(WHITE); //fill the image with white
        offscreen.fillRect(0, 0, canvasWidth, canvasHeight);
    }


    private void paintGrid() {
        //same as before, only we draw in memory now
        //only using offscreen instead of the original graphics
    }
    @Override
    public void update(Graphics g) { } //No need for update

    //Draw the offscreen image, using the original graphics
    @Override
    protected void paintComponent(Graphics graphics) {
        graphics.drawImage(image, 0, 0, this);
    }
}

