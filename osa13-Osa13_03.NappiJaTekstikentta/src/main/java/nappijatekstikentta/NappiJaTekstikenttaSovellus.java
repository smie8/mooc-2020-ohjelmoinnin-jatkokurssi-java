package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class NappiJaTekstikenttaSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        TextField tekstikentta = new TextField("Uusi tekstikenttä");
        Button nappi = new Button("Uusi nappi");
        
        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(nappi);
        komponenttiryhma.getChildren().add(tekstikentta);
        
        Scene nakyma = new Scene(komponenttiryhma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }

}
