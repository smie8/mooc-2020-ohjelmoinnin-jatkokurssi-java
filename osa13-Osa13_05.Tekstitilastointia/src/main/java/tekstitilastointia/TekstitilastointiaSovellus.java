package tekstitilastointia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TekstitilastointiaSovellus extends Application{
    
    @Override
    public void start(Stage ikkuna) {
        BorderPane bpane = new BorderPane();
        bpane.setCenter(new TextArea());
        
        HBox alaboksi = new HBox();
        alaboksi.setSpacing(10);
        alaboksi.getChildren().add(new Label("Kirjaimia: 0"));
        alaboksi.getChildren().add(new Label("Sanoja: 0"));
        alaboksi.getChildren().add(new Label("Pisin sana on:"));
        bpane.setBottom(alaboksi);
        
        Scene nakyma = new Scene(bpane);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

}
