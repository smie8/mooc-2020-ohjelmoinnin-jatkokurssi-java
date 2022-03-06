package nappijatekstielementti;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class NappiJaTekstielementtiSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        Button nappi = new Button("Tämä on nappi");
        Label tekstikomponentti = new Label("Tekstielementti");
        
        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(nappi);
        komponenttiryhma.getChildren().add(tekstikomponentti);
        
        Scene nakyma = new Scene(komponenttiryhma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }

    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
    }

}
