package assignment_3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;

import java.util.Random;

import static javafx.scene.paint.Color.*;
import static javafx.scene.text.Font.font;

/**
 * This is a test class which is used to create three teams and a referee
 * @author Zhiping Yu  student#:000822513  date:2020,06,19
 * @version 1
 */
public class ThreeTeams extends Application {
    /** Colors for three different teams **/
    private final Color COLOR_1 = PINK;
    private final Color COLOR_2 = GREEN;
    private final Color COLOR_3 = PURPLE;
    /** Names for three different teams **/
    private final String  NAME_1 = "Wolf";
    private final String NAME_2 = "Tiger";
    private final String NAME_3 = "Lion";
    /** Set Canvas size in pixels **/
    private final int Width = 860;
    private final int Height = 800;
    /** Each team start point X coordinate **/
    private final int X = 50;
    /** First team start point y coordinate **/
    private final int Y = 35;
    /** The vertical distance between two close teams **/
    private final int Vertical_Gap = 250;
    /** The referee' body shape start point X  and Y coordinate **/
    private final int Referee_X = 700;
    private final int Referee_Y = 285;
    /** The referee's title start point X and Y coordinate **/
    private final int Referee_Title_X = 710;
    private final int Referee_Title_Y = 490;


    /**
     * The actual main method that launch the app
      * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Start method(use this instead of main)
      * @param stage The FX stage to draw on
     * @throws Exception
     */
    public void start(Stage stage)throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(Width,Height);// set canvas size in pixels
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        stage.setTitle("Robotic Olympics!");// set window title
        gc.setStroke(PURPLE);
        gc.strokeRect(10,5,840,780);// draw a rectangle to store stuff
        // Create three teams with different color
        Team team_1 = new Team(NAME_1, X, Y, COLOR_1);
        Team team_2 = new Team(NAME_2, X, Y+Vertical_Gap, COLOR_2);
        Team team_3 = new Team(NAME_3, X, Y+Vertical_Gap*2, COLOR_3);
        team_1.draw(gc);
        team_2.draw(gc);
        team_3.draw(gc);
        Random random = new Random(); // create a Random object
        int choice = random.nextInt(3); // get random integer from 0-2
        System.out.println(choice);
        drawAReferee(choice,gc);
        gc.setFill(SKYBLUE);
        gc.setFont(font("Times New Roman",18));
        gc.fillText("Programed by Zhiping Yu", 640,50);// display author name
        stage.show();


    }

    /**
     * Draw a special player who is a referee
     * @param choice get an integer from zero to two randomly
     * @param gc GraphicsContext to draw on
     */
    public void drawAReferee(int choice, GraphicsContext gc){
        Player referee;
        if (choice == 0) { // situation one
            referee = new Player(Referee_X, Referee_Y, COLOR_1, NAME_1); // create and initialize a referee
            referee.draw(gc);
            gc.setFill(COLOR_1);
            gc.fillText("Head "+NAME_1,Referee_Title_X,Referee_Title_Y); // display head and title of the team


        } else if (choice == 1) {// situation 2
            referee = new Player(Referee_X, Referee_Y, COLOR_2, NAME_2);
            referee.draw(gc);
            gc.setFill(COLOR_2);
            gc.fillText("Head "+NAME_2,Referee_Title_X,Referee_Title_Y);


        } else if(choice == 2) {// situation 3
            referee = new Player(Referee_X, Referee_Y, COLOR_3, NAME_3);
            referee.draw(gc);
            gc.setFill(COLOR_3);
            gc.fillText("Head "+NAME_3,Referee_Title_X,Referee_Title_Y);

        }


    }


}
