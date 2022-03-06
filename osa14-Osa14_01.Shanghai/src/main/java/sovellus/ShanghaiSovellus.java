package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application{
    
@Override
public void start(Stage ikkuna) {
    // luodaan kaaviossa käytettävät x- ja y-akselit
    NumberAxis xAkseli = new NumberAxis(2006, 2018, 1);
    NumberAxis yAkseli = new NumberAxis();

    // asetetaan akseleille nimet
    xAkseli.setLabel("Vuosi");
    yAkseli.setLabel("Sijoitus");

    // luodaan viivakaavio. Viivakaavion arvot annetaan numeroina
    // ja se käyttää aiemmin luotuja x- ja y-akseleita
    LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
    viivakaavio.setTitle("Helsingin Yliopiso, Shanghai-ranking");

    // luodaan viivakaavioon lisättävä datajoukko
    XYChart.Series data = new XYChart.Series();
    data.setName("Shanghai");
    // lisätään datajoukkoon yksittäisiä pisteitä
    data.getData().add(new XYChart.Data(2007, 73));
    data.getData().add(new XYChart.Data(2008, 68));
    data.getData().add(new XYChart.Data(2009, 72));
    data.getData().add(new XYChart.Data(2010, 72));
    data.getData().add(new XYChart.Data(2011, 74));
    data.getData().add(new XYChart.Data(2012, 73));
    data.getData().add(new XYChart.Data(2013, 76));
    data.getData().add(new XYChart.Data(2014, 73));
    data.getData().add(new XYChart.Data(2015, 67));
    data.getData().add(new XYChart.Data(2016, 56));
    data.getData().add(new XYChart.Data(2017, 56));

    // lisätään datajoukko viivakaavioon
    viivakaavio.getData().add(data);

    // näytetään viivakaavio
    Scene nakyma = new Scene(viivakaavio, 640, 480);
    ikkuna.setScene(nakyma);
    ikkuna.show();
}

    public static void main(String[] args) {
        launch(ShanghaiSovellus.class);
    }

}
