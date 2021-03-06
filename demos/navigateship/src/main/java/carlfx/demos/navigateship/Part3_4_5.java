package carlfx.demos.navigateship;

import carlfx.gameengine.GameWorld;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * The main driver of the game.
 *
 * @author cdea
 */
public class Part3_4_5 extends Application {

    GameWorld gameWorld = new TheExpanse(59, "JavaFX 2 GameTutorial Part 4 Collision");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // setup title, scene, stats, controls, and actors.
        gameWorld.initialize(primaryStage);

        // kick off the game loop
        gameWorld.beginGameLoop();

        // display window
        primaryStage.show();
    }

}
