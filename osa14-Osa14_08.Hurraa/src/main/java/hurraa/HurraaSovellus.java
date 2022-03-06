package hurraa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import static javafx.application.Application.launch;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import java.util.*;


public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) {
 //   public void start(Stage stage) throws Exception {

        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);
        AudioClip aani = new AudioClip("file:Applause-Yannick_Lemieux.wav");
             
        nappi.setOnMouseClicked((MouseEvent event) -> {
            aani.play();          
        });

        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
