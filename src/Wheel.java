package assignment_3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class is used to create a wheel
 * @author Zhiping student#: 000822513 date: 2020,06,19
 * @version 1
 */
public class Wheel {
    /**
     * X and Y location of top left of the square
     */
    private double x;
    private double y;

    /**
     * Constructor
     * @param x Left of the square
     * @param y Top of the square
     */
    public Wheel(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Draw the oval
     * @param gc GraphicsContext to draw on
     */
    public void draw(GraphicsContext gc){
        gc.fillOval(x,y,10,100);
    }

}
