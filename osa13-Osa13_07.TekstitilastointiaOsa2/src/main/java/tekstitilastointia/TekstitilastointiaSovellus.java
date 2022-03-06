package tekstitilastointia;

import java.util.Arrays;
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
        TextArea tekstialue = new TextArea();
        bpane.setCenter(tekstialue);
        Label labeli1 = new Label("Kirjaimia: 0");
        Label labeli2 = new Label("Sanoja: 0");
        Label labeli3 = new Label("Pisin sana on:");
        
        HBox alaboksi = new HBox();
        alaboksi.setSpacing(10);
        alaboksi.getChildren().add(labeli1);
        alaboksi.getChildren().add(labeli2);
        alaboksi.getChildren().add(labeli3);
        bpane.setBottom(alaboksi);
        
        tekstialue.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;
            String pisin = Arrays.stream(palat)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();

            // asetetaan arvot tekstielementteihin
            labeli1.setText("Kirjaimia: " + merkkeja);
            labeli2.setText("Sanoja: " + sanoja);
            labeli3.setText("Pisin sana on: " + pisin);
        });
        
        Scene nakyma = new Scene(bpane);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

}
