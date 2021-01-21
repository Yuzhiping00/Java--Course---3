package assignment_3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class is used to create a head
 * @author Zhiping Yu  student#:000822513 date: 2020,06,19
 * @version 1
 *
 */
public class Head {
    /**
     * X and Y location of top left of square
     */
    private double x;
    private double y;

    /**
     * Constructor
      * @param x Left of square
     * @param y Top of square
     */
    public Head(double x,double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Draw the square
     * @param gc The GraphicsContext to draw on
     */
    public void draw(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillRect(x,y,60,60);
        gc.fillRect(x+20,y+56,20,20);

    }


}
