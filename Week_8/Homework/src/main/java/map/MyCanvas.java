package map;
import daos.*;
import java.awt.*;
import java.sql.SQLException;
import javax.swing.*;

import static java.lang.Math.PI;
import static java.lang.Math.tan;

/**
 * This class displays the map we created for the cities in the database.
 */
public class MyCanvas extends Canvas{

    public MyCanvas(){}

    /**
     * This method paints on the canvas.
     * @param g   the specified Graphics context
     */
    public void paint(Graphics g) {

        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Image image=toolkit.getImage("src/main/resources/world.png");
        g.drawImage(image, 0,0,this);


        double mapWidth    = 1500;
        double mapHeight   = 800;

        int numberOfCities;

        CityDAO myCityDAO=new CityDAO();
        try {
             numberOfCities= myCityDAO.getMaximId();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //gets all the cities in the database
        for(int index=1;index<=numberOfCities;index++) {

            double latitude= 0;
            try {
                latitude = myCityDAO.getCityLatitudeById(index);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            double longitude= 0;
            try {
                longitude = myCityDAO.getCityLongitudeById(index);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            // get x value
            double xCoordonate = (longitude + 180) * (mapWidth / 360);

            // convert from degrees to radians
            double latRad = latitude * PI / 180;

            // get y value
            double value = Math.log(tan((PI / 4) + (latRad / 2)));
            double yCoordonate = (mapHeight / 2) - (mapWidth * value / (2 * PI));


            String cityName= null;
            try {
                cityName = myCityDAO.getCityNameById(index);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            g.setFont(g.getFont().deriveFont(10f));

            g.drawString(cityName, (int) xCoordonate, (int) yCoordonate);

        }

    }

    /**
     * This method displays the canvas on the screen
     */
    public void showCanvas(){
        MyCanvas m=new MyCanvas();
        JFrame frame=new JFrame();
        frame.add(m);
        frame.setSize(1700,1000);
        frame.setVisible(true);

        if (JOptionPane.showConfirmDialog( frame,"This was the map","Exit when you want",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);

    }


}