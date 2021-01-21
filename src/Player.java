package assignment_3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

import static javafx.scene.paint.Color.BLACK;

/**
 * This class is to create a player and obtain the points
 * @author Zhiping Yu  student#:000822513 date:2020,06,19
 * @version 1
 */
public class Player {
    /** X and Y location of a square for a play's body shape **/
    private double x;
    private double y;
    /** A player's title **/
    private String title;
    /** A player's point **/
    private int average;
    /** Declare a head for a player **/
    private Head head;
    /** Declare two wheels for a player **/
    private Wheel wheel_left;
    private Wheel wheel_right;
    /** Declare a player's body color **/
    private Color color;

    /**
     * First Constructor with three parameters
     * @param x Initialize left of body shape
     * @param y Initialize top of body shape
     * @param color Initialize player's body color
     */
    public Player(double x,double y,Color color){
        this(x,y,color,""); // call the constructor with four parameters

    }

    /**
     * Constructor with complete parameters
     * @param x Initialize player's body shape X location
     * @param y Initialize player's body shape  Y location
     * @param color Initialize player's body color
     * @param title Initialize the title for the player
     */
    public Player(double x, double y, Color color, String title){
        this.x = x;
        this.y = y;
        this.color = color;
        this.title = title;
        head = new Head(x+27,y);
        wheel_left = new Wheel(x,y+75);
        wheel_right = new Wheel(x+110,y+75);


    }

    /**
     * Draw the player with one head, two wheels and a body shape
      * @param gc GraphicsContext to draw on
     */
    public void draw(GraphicsContext gc){
        head.draw(gc);
        wheel_left.draw(gc);
        wheel_right.draw(gc);
        gc.setFill(color);
        gc.fillOval(x+10,y+75,100,100);
        gc.setFill(BLACK);
        average =(int) (Math.random()*99);// get the random number for  a player
        gc.fillText(String.valueOf(average),x+45,y+125); // display the average to the center of the body shape

    }

    /**
     * Get the point of a player
     * @return the point of a player
     */
    public int getAverage(){
        return average;

    }

}
