package assignment_3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

/**
 * This class is used to create a team with three players with different body colors and display the team's name and
 * average points from three players
 * @author Zhiping Yu  student#:000822513 date:2020,06,19
 * @version 1
 */
public class Team {
    /** The name of the team **/
    private String name;
    /** X and Y location of top left of the team **/
    private double x;
    private double y;
    /** The color of players' body **/
    private Color color;
    /** Declare three players **/
    private Player player1, player2,player3;

    /**
     * Constructor
      * @param name Initialize team's name
     * @param x Initialize team's X location
     * @param y Initialize team's Y location
     * @param color Initialize player's body color
     */
    public Team(String name, double x, double y, Color color) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
        player1 = new Player(x,y,color);
        player2 = new Player(x+150,y,color);
        player3 = new Player(x+300,y,color);

    }

    /**
     * Draw three players on a GraphicsContext object
     * @param gc The GraphicsContext to draw on
     */
    public void draw(GraphicsContext gc){
        gc.setFont(Font.font("Courier New",20)); // set font of the team's name
        player1.draw(gc);
        player2.draw(gc);
        player3.draw(gc);
        // calculate average points of a team
        double teamAve = (player1.getAverage()+player2.getAverage()+ player3.getAverage())/3.0;
        String temp = name + " (team average ";
        String str = String.format("%.1f )",teamAve);
        gc.setFill(color);
        gc.fillText(temp +str,x+10,y+210); // display team's name and average points




    }

    

}
