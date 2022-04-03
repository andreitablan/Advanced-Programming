package Compulsory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelEvent;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label;
    //JSpinner spinner;
    int rows;
    int cols;

    JButton create;
    JButton load;
    JButton save;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //create the label and the spinner
        label = new JLabel("Grid size:");
        //spinner = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));

        //create spinners for rows and cols, and the button
        JSpinner colums;
        colums = new JSpinner(new SpinnerNumberModel(8, 2, 100, 1));

        JSpinner rows;
        rows = new JSpinner(new SpinnerNumberModel(8, 2, 100, 1));

        create = new JButton("Create");
        create.addActionListener(this::createImage);

        add(label); //JPanel uses FlowLayout by default
        //add(spinner);
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
    private void createImage(ActionEvent actionEvent) {
        // Create the grid
        //frame.canvas.offscreen.setColor(new Color(255, 255, 255));
        //frame.canvas.offscreen.fillRect(0, 0, frame.getCanvas().getWidth(), frame.getCanvas().getHeight());
        //frame.canvas.repaint();
        //frame.setTransferHandler();

        frame.remove(frame.canvas);
        frame.canvas= new DrawingPanel(frame);
        add(frame.canvas, BorderLayout.CENTER);
        frame.pack();
        System.out.println("Drawn img");
    }
    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
