package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application {

  @Override
  public void start(Stage ikkuna) {

    VBox eka = new VBox();
    eka.getChildren().add(new Label("Kirjoitahan nimesi, niin päästään etenemään."));
    TextField tekstikentta = new TextField();
    eka.getChildren().add(tekstikentta);
    Button ekabuttoni = new Button("Alotahan");
    eka.getChildren().add(ekabuttoni);
      
      
    VBox toka = new VBox();
    Label teksti = new Label("Teksti");
    toka.getChildren().add(teksti);
//
    Scene ekanakyma = new Scene(eka);
    Scene tokanakyma = new Scene(toka);
//
    ekabuttoni.setOnAction((event) -> {
        ikkuna.setScene(tokanakyma);
        teksti.setText("Tervetuloa " + tekstikentta.getText() + "!");
        
    });

    ikkuna.setScene(ekanakyma);
    ikkuna.show();
  }

  public static void main(String[] args) {
      launch(TervehtijaSovellus.class);
      System.out.println("FOO");
  }
}
