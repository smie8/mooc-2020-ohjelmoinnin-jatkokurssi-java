package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

  @Override
  public void start(Stage ikkuna) {

      BorderPane eka = new BorderPane();
      Button ekabuttoni = new Button("Tokaan näkymään!");
      eka.setTop(new Label("Eka näkymä!"));
      eka.setCenter(ekabuttoni);
      
      VBox toka = new VBox();
      Button tokabuttoni = new Button("Kolmanteen näkymään!");
      toka.getChildren().add(tokabuttoni);
      toka.getChildren().add(new Label("Toka näkymä!"));
      
      GridPane kolmas = new GridPane();
      Button kolmasbuttoni = new Button("Ekaan näkymään!");
      kolmas.add(new Label("Kolmas näkymä!"), 0, 0);
      kolmas.add(kolmasbuttoni, 1, 1);


      Scene ekanakyma = new Scene(eka);
      Scene tokanakyma = new Scene(toka);
      Scene kolmasnakyma = new Scene(kolmas);

      ekabuttoni.setOnAction((event) -> {
          ikkuna.setScene(tokanakyma);
      });

      tokabuttoni.setOnAction((event) -> {
          ikkuna.setScene(kolmasnakyma);
      });
      
      kolmasbuttoni.setOnAction((event) -> {
          ikkuna.setScene(ekanakyma);
      });

      ikkuna.setScene(ekanakyma);
      ikkuna.show();
  }

  public static void main(String[] args) {
      launch(UseampiNakyma.class);
  }
}
