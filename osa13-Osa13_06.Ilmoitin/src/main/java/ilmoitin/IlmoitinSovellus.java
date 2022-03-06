package ilmoitin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class IlmoitinSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        TextField tekstikentta = new TextField();
        Button nappi = new Button("buttoni");
        Label labeli = new Label("jea");
        
        VBox boksi = new VBox();
        boksi.setSpacing(20);
        boksi.getChildren().add(tekstikentta);
        boksi.getChildren().add(nappi);
        boksi.getChildren().add(labeli);
        
        nappi.setOnAction((event) -> {
           labeli.setText(tekstikentta.getText());
        });
        
        Scene nakyma = new Scene(boksi);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
    }

}
