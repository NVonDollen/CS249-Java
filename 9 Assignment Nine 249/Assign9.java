import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.File;
/*
 * Nick VonDollen
 * 10/28/2016
 * CS 249 -- Dr. Reale
 * Assignment 9
 */
public class Assign9 extends Application
{
    public void start(Stage primaryStage)
    {
       try
       {
           Scanner input = new Scanner(new File("Map01.txt"));
           Map map = new Map();
           map.load(input);

           MapPane newPane = new MapPane(map);
           Pane displayPane = new Pane();

           displayPane.getChildren().add(newPane);

           Player player = new Player(5,5);
           PlayerPane playerPane = new PlayerPane(player);
           displayPane.getChildren().add(playerPane);
           int col = map.getMapCols();
           int row = map.getMapRows();
           Scene scene = new Scene(displayPane,32*col,32*row);
           scene.setOnKeyPressed(e -> {
               IntegerProperty xCheck = player.getXProperty();
               IntegerProperty yCheck = player.getYProperty();

               switch(e.getCode()) {
               
                   case A:	//if player presses A
                       xCheck.setValue(xCheck.intValue()-1);
                       if(map.canMoveTo(xCheck.intValue(),yCheck.intValue()))
                       {
                           player.setCoordinates(xCheck.intValue(), yCheck.intValue());
                       }
                       else
                       {
                           xCheck.setValue(xCheck.intValue()+1);
                       }
                       break;
                       /////////////////
                   case D:	//if player presses D
                       xCheck.setValue(xCheck.intValue()+1);
                       if(map.canMoveTo(xCheck.intValue(),yCheck.intValue()))
                       {
                           player.setCoordinates(xCheck.intValue(), yCheck.intValue());
                       }
                       else
                       {
                           xCheck.setValue(xCheck.intValue()-1);
                       }
                       break;
                       //////////////////
                   case W:	//if player presses W
                       yCheck.setValue(yCheck.intValue()-1);
                       if(map.canMoveTo(xCheck.intValue(),yCheck.intValue()))
                       {
                           player.setCoordinates(xCheck.intValue(), yCheck.intValue());
                       }
                       else
                       {
                           yCheck.setValue(yCheck.intValue()+1);
                       }
                       break;
                       
                   case S:	//if player presses S
                       yCheck.setValue(yCheck.intValue()+1);
                       if(map.canMoveTo(xCheck.intValue(),yCheck.intValue()))
                       {
                           player.setCoordinates(xCheck.intValue(), yCheck.intValue());
                       }
                       else
                       {
                           yCheck.setValue(yCheck.intValue()-1);
                       }

                       break;
                   default:
                       break;
               }
           });
           primaryStage.setTitle("NetHack");
           primaryStage.setScene(scene);
           primaryStage.show();
       }
       catch(Exception e)
       {
           e.printStackTrace();
           Platform.exit();
       }
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
