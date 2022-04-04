package Compulsory;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.ActionMapUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

/**
 * This is the class for the Control Panel
 */
public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton exitBtn = new JButton("Exit");
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton resetBtn = new JButton("Reset");

    /**
     * The basic constructor
     * @param frame
     */
    public ControlPanel(MainFrame frame) {
        this.frame = frame; init();
    }

    /**
     * This is the initialization method
     */
    private void init() {

        setLayout(new GridLayout(1, 4));
        add(saveBtn, BorderLayout.CENTER);
        add(loadBtn, BorderLayout.CENTER);
        add(resetBtn, BorderLayout.CENTER);
        add(exitBtn, BorderLayout.CENTER);

        saveBtn.addActionListener(this::saveGame);
        loadBtn.addActionListener(this::loadGame);
        resetBtn.addActionListener(this::resetGame);
        exitBtn.addActionListener(this::exitGame);
    }

    /**
     * This is the method for saving an image of the game, it uses JFileChooser from swing
     * @param e
     */
    private void saveGame(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();

        /**
         * It will only choose files of the png type.
         */
        fileChooser.setFileFilter(new FileNameExtensionFilter("*.png", "png"));

        /**
         * If the user selects to save the file
         */
        int option = fileChooser.showSaveDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try {
                ImageIO.write(frame.canvas.image, "PNG", new File(fileToSave.getAbsolutePath()));
                System.out.println("Image saved.");
            }
            catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        }
        else if (option == JFileChooser.CANCEL_OPTION) {
            System.out.println("Canceled operation.");
        }
        else {
            System.out.println("ERROR: It could not save the file.");
        }
    }

    /**
     * This is the loadGame button used to load an image
     * @param e
     */
    private void loadGame(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("*.png", "png"));

        /**
         * If the user selects an image
         */
        int option = fileChooser.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                Image image = ImageIO.read(new File(fileChooser.getSelectedFile().getAbsolutePath()));
                frame.getCanvas().offscreen.drawImage(image, 0, 0, frame.getCanvas());
                frame.getCanvas().repaint();
                System.out.println("Image loaded.");
            }
            catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        }
        else if (option == JFileChooser.CANCEL_OPTION) {
            System.out.println("Canceled option.");
        }
        else {
            System.out.println("ERROR: It could not load.");
        }
    }

    /**
     * The reset the game button
     * @param e
     */
    private void resetGame(ActionEvent e) {
        frame.canvas.offscreen.setColor(new Color(255, 255, 255));
        frame.canvas.offscreen.fillRect(0, 0, frame.getCanvas().getWidth(), frame.getCanvas().getHeight());
        frame.canvas.repaint();
        System.out.println("Reset the canvas.");
    }

    /**
     * Exit the game button
     * @param e
     */
    private void exitGame(ActionEvent e) {
        System.out.println("Exited from the app!");

        frame.dispose();
        System.exit(0);
    }

}

