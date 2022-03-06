package sovellus;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaastolaskuriSovellus extends Application {
    
@Override
public void start(Stage ikkuna) {
    
    BorderPane bp = new BorderPane();
    
    VBox vb = new VBox();
    
    BorderPane bp1 = new BorderPane();
    Label kk = new Label("Kuukausittainen tallennus");
    bp1.setLeft(kk);
    Slider saastoSlider = new Slider();
    saastoSlider.setMin(25);
    saastoSlider.setMax(250);
    saastoSlider.setValue(25);
    saastoSlider.setShowTickLabels(true);
    saastoSlider.setShowTickMarks(true);
    saastoSlider.setMajorTickUnit(25);
    saastoSlider.setMinorTickCount(5);
    saastoSlider.setBlockIncrement(25);
    bp1.setCenter(saastoSlider);
    Label saastoSlidernArvo = new Label("");
    bp1.setRight(saastoSlidernArvo);
    vb.getChildren().add(bp1);
    
    BorderPane bp2 = new BorderPane();
    Label vuosittainenKorko = new Label("Vuosittainen korko");
    bp2.setLeft(vuosittainenKorko);
    Slider korkoSlider = new Slider();
    korkoSlider.setMin(0);
    korkoSlider.setMax(10);
    korkoSlider.setValue(0);
    korkoSlider.setShowTickLabels(true);
    korkoSlider.setShowTickMarks(true);
    korkoSlider.setMajorTickUnit(10);
    korkoSlider.setMinorTickCount(1);
    saastoSlider.setBlockIncrement(0.1);
    bp2.setCenter(korkoSlider);
    Label korkoLabel = new Label("0");
    bp2.setRight(korkoLabel);
    vb.getChildren().add(bp2);
    
    NumberAxis xAkseli = new NumberAxis(0, 30, 1);
    NumberAxis yAkseli = new NumberAxis();
    xAkseli.setLabel("Vuosia");
    yAkseli.setLabel("Säästöt (€)");    
    LineChart<Number, Number> kaavio = new LineChart<>(xAkseli, yAkseli);
    kaavio.setTitle("Säästölaskuri");
    
    bp.setCenter(kaavio);
    bp.setTop(vb);
    
    int rahat = 0;
    int saastoPerKk = 25;
    // luodaan viivakaavioon lisättävä datajoukko
    XYChart.Series data = new XYChart.Series();
    XYChart.Series korkodata = new XYChart.Series();
    
    for (int i = 0; i <= 30; i++) {
        data.getData().add(new XYChart.Data(i, rahat));
        rahat += 25*12;
    }
    kaavio.getData().add(data);
    kaavio.getData().add(korkodata);
    
    kaavio.setAnimated(false);

    saastoSlider.valueProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
        int tempSaasto;
        int rahatAlussa = 0;
              
        data.getData().clear();
        saastoSlidernArvo.setText("" + uusiArvo.intValue());
        tempSaasto = uusiArvo.intValue();
        rahatAlussa = 0;
        for (int i = 0; i <= 30; i++) {
            data.getData().add(new XYChart.Data(i, rahatAlussa));
            rahatAlussa += tempSaasto*12;
        }
        
        // korkokäyrä
        double tempSaasto2;
        double rahatAlussa2 = 0;
        double uusiArvo2 = korkoSlider.getValue();

        korkodata.getData().clear();
        korkoLabel.setText("" + uusiArvo2);
        tempSaasto2 = saastoSlider.getValue();
        int tempsaastoInt = (int)tempSaasto2;
        double korko = uusiArvo2/100;

        rahatAlussa2 = 0;
        double rahojenLisays;
        
        for (int i = 0; i <= 30; i++) {
            korkodata.getData().add(new XYChart.Data(i, rahatAlussa2));
            rahatAlussa2 = (rahatAlussa2 + tempsaastoInt*12) * (korko + 1);
        }
       
    });
    
    // vuosittainen korko -saastoSlider
    korkoSlider.valueProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
        double kkSaasto = saastoSlider.getValue();
        double saastot = 0;

        korkodata.getData().clear();
        korkoLabel.setText("" + uusiArvo.doubleValue());
        double korko = uusiArvo.doubleValue()/100;
       
        for (int i = 0; i <= 30; i++) {
            korkodata.getData().add(new XYChart.Data(i, saastot));
            saastot = ((saastot + kkSaasto*12) * (korko + 1));
        }
        
    });
   
    // näytetään viivakaavio
    Scene nakyma = new Scene(bp, 640, 480);
    ikkuna.setScene(nakyma);
    ikkuna.show();
}

    public static void main(String[] args) {
        launch(SaastolaskuriSovellus.class);
    }

}
