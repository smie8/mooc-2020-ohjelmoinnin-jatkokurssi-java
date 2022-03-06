package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class HymioSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        BorderPane bp = new BorderPane();
        Canvas taulu = new Canvas(640, 480);
        bp.setCenter(taulu);
        GraphicsContext piirturi = taulu.getGraphicsContext2D();
        
        piirturi.fillRect(100, 50, 50, 50);
        piirturi.fillRect(500, 50, 50, 50);
        piirturi.fillRect(200, 350, 280, 10);
        
        Scene nakyma = new Scene(bp);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }

}
