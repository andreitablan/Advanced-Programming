package Compulsory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelEvent;

/**
 * This is the Configuration Panel used for buttons and spinners
 */
public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label;
    int rows;
    int cols;

    JButton create;

    /**
     * This is the constructor for this panel
     * @param frame
     */
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    /**
     * This is the initialization of the panel
     */
    private void init() {
        /**
         * This label shows the Grid size selection
         */
        label = new JLabel("Grid size:");

        /**
         * These are the spinners for choosing the number if colums and rows
         */
        JSpinner colums;
        colums = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));

        JSpinner rows;
        rows = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));

        create = new JButton("Create");
        create.addActionListener(this::createImage);

        add(label); //JPanel uses FlowLayout by default
        add(rows);
        add(colums);
        add(create);

        try {
            rows.commitEdit();
        } catch ( java.text.ParseException e ) {
            System.out.println("Nu a reusit sa converteasca liniile");
        }
        this.rows = (Integer) rows.getValue();
        try {
            colums.commitEdit();
        } catch ( java.text.ParseException e ) { System.out.println("Nu a reusit sa converteasca coloanele");}
        this.cols = (Integer) colums.getValue();
    }

    /**
     * this function handles the event when pressing Create button
     * @param actionEvent
     */
    private void createImage(ActionEvent actionEvent) {

        frame.canvas.offscreen.setColor(new Color(255, 255, 255));
        frame.canvas.offscreen.fillRect(0, 0, frame.getCanvas().getWidth(), frame.getCanvas().getHeight());
        frame.canvas.repaint();

        /**
        frame.canvas.offscreen.setColor(new Color(255, 255, 255));
        frame.canvas.offscreen.fillRect(0, 0, frame.getCanvas().getWidth(), frame.getCanvas().getHeight());
        frame.canvas.repaint();


        frame.setTransferHandler();
        frame.remove(frame.canvas);
        frame.canvas= new DrawingPanel(frame);
        add(frame.canvas, BorderLayout.CENTER);
        frame.pack();
        System.out.println("Drawn img");
         */
    }

    /**
     * Getter for Rows
     * @return
     */
    public int getRows() {
        return rows;
    }

    /**
     * Getter for Cols
     * @return
     */
    public int getCols() {
        return cols;
    }
}
