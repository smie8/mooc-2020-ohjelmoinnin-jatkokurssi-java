package ristinolla;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class RistinollaSovellus extends Application {
    @Override
    public void start(Stage ikkuna) throws Exception {
        
        BorderPane asettelu = new BorderPane();
        Label ylateksti = new Label("Vuoro: X");
        Ristinollapeli ristinolla = new Ristinollapeli();
        
        GridPane ristikko = new GridPane();
        Button ylavas = new Button(" ");
        Button ylakeski = new Button(" ");
        Button ylaoik = new Button(" ");
        Button keskivas = new Button(" ");
        Button keskikeski = new Button(" ");
        Button keskioik = new Button(" ");
        Button alavas = new Button(" ");
        Button alakeski = new Button(" ");
        Button alaoik = new Button(" ");
        
        ArrayList<Button> buttonit = new ArrayList<>();
        buttonit.add(ylavas);
        buttonit.add(ylakeski);
        buttonit.add(ylaoik);
        buttonit.add(keskivas);
        buttonit.add(keskikeski);
        buttonit.add(keskioik);
        buttonit.add(alavas);
        buttonit.add(alakeski);
        buttonit.add(alaoik);
        
        ristikko.add(ylavas, 0, 0);
        ristikko.add(ylakeski, 0, 1);
        ristikko.add(ylaoik, 0, 2);
        ristikko.add(keskivas, 1, 0);
        ristikko.add(keskikeski, 1, 1);
        ristikko.add(keskioik, 1, 2);
        ristikko.add(alavas, 2, 0);
        ristikko.add(alakeski, 2, 1);
        ristikko.add(alaoik, 2, 2);
        
        for (int i = 0; i < buttonit.size(); i++) {
            
            Button nappi = buttonit.get(i);
            nappi.setFont(Font.font("Monospaced", 40));
            
            buttonit.get(i).setOnAction((event) -> {
                Label ylatekstiTemp = ylateksti;
                if (ylatekstiTemp.getText().equals("Vuoro: X") && nappi.getText().equals(" ")){
                    ylateksti.setText("Vuoro: O");
                    nappi.setText("X");
                } else if (nappi.getText().equals(" ") && ylatekstiTemp.getText().equals("Vuoro: O")){
                    ylateksti.setText("Vuoro: X");
                    nappi.setText("O");
                }

                if (((buttonit.get(0).getText().equals("X") && buttonit.get(1).getText().equals("X") && buttonit.get(2).getText().equals("X")) ||
                        (buttonit.get(3).getText().equals("X") && buttonit.get(4).getText().equals("X") && buttonit.get(5).getText().equals("X")) ||
                        (buttonit.get(6).getText().equals("X") && buttonit.get(7).getText().equals("X") && buttonit.get(8).getText().equals("X")) ||
                        (buttonit.get(0).getText().equals("X") && buttonit.get(3).getText().equals("X") && buttonit.get(6).getText().equals("X")) ||
                        (buttonit.get(1).getText().equals("X") && buttonit.get(4).getText().equals("X") && buttonit.get(7).getText().equals("X")) ||
                        (buttonit.get(2).getText().equals("X") && buttonit.get(5).getText().equals("X") && buttonit.get(8).getText().equals("X")) ||
                        (buttonit.get(0).getText().equals("X") && buttonit.get(4).getText().equals("X") && buttonit.get(8).getText().equals("X")) ||
                        (buttonit.get(2).getText().equals("X") && buttonit.get(5).getText().equals("X") && buttonit.get(6).getText().equals("X"))
                        ) || 
                        ((buttonit.get(0).getText().equals("O") && buttonit.get(1).getText().equals("O") && buttonit.get(2).getText().equals("O")) ||
                        (buttonit.get(3).getText().equals("O") && buttonit.get(4).getText().equals("O") && buttonit.get(5).getText().equals("O")) ||
                        (buttonit.get(6).getText().equals("O") && buttonit.get(7).getText().equals("O") && buttonit.get(8).getText().equals("O")) ||
                        (buttonit.get(0).getText().equals("O") && buttonit.get(3).getText().equals("O") && buttonit.get(6).getText().equals("O")) ||
                        (buttonit.get(1).getText().equals("O") && buttonit.get(4).getText().equals("O") && buttonit.get(7).getText().equals("O")) ||
                        (buttonit.get(2).getText().equals("O") && buttonit.get(5).getText().equals("O") && buttonit.get(8).getText().equals("O")) ||
                        (buttonit.get(0).getText().equals("O") && buttonit.get(4).getText().equals("O") && buttonit.get(8).getText().equals("O")) ||
                        (buttonit.get(2).getText().equals("O") && buttonit.get(5).getText().equals("O") && buttonit.get(6).getText().equals("O"))
                        )) 
                {    
                    ylateksti.setText("Loppu!");
                };
                
            });
        }
                
        asettelu.setTop(ylateksti);
        asettelu.setCenter(ristikko);
        
        Scene nakyma = new Scene(asettelu);
        
        
        
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
    }

}
