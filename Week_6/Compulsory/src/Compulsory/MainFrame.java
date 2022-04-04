package Compulsory;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.util.Stack;

import static javax.swing.SwingConstants.CENTER;

/**
 * This is the main fraim of the aplication
 */
public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    /**
     * This is the basic constructor for this class
     */
    public MainFrame() {
        super("My game");
        init();
    }

    /**
     * This is the function for initalization
     */
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        configPanel = new ConfigPanel(this);
        canvas = new DrawingPanel(this);
        controlPanel = new ControlPanel(this);

        /**
         * This arrange the components in the continer
         * JFrame uses BorderLayout by default
         */

        add(configPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        /**
         * This invokes the layout manager
         */
        pack();
    }

    /**
     * Getter for the configuration Panel
     * @return
     */
    public ConfigPanel getConfigPanel() {
        return configPanel;
    }

    /**
     * Getter for the control panel
     * @return
     */
    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    /**
     * Geter for the canvas of the aplication
     * @return
     */
    public DrawingPanel getCanvas() {
        return canvas;
    }
}