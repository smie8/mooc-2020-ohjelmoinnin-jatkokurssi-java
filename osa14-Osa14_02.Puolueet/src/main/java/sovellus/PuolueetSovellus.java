package sovellus;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueetSovellus extends Application{
    
@Override
public void start(Stage ikkuna) {
    
    BufferedReader br;
    List<String> lista = new ArrayList<>();
    
    try {
        br = new BufferedReader(new FileReader("puoluedata.tsv"));
        String line = br.readLine();
        while (line != null) {
            lista.add(line);
            line = br.readLine();
        }
        
        br.close();
        
    } catch (Exception e) {
        System.out.println(e);
    }
    
    for (String rivi: lista)  {
        System.out.println("rivi: " + rivi);
    }
    
    ArrayList<Integer> vuodet = new ArrayList<>();
    String vuosipalat[] = lista.get(0).split("\t");
    for (int i = 1; i < 12; i++) {
        vuodet.add(Integer.parseInt(vuosipalat[i]));
    }
    
    String puolueet[] = new String[8];
    String palat[];
    for (int i = 1; i < lista.size(); i++) {
        palat = lista.get(i).split("\t");
        puolueet[i] = palat[0];
        System.out.println(puolueet[i]);
    }
    
    
    
    
    // luodaan kaaviossa käytettävät x- ja y-akselit
    NumberAxis xAkseli = new NumberAxis(1968, 2008, 4);
    NumberAxis yAkseli = new NumberAxis();

    // asetetaan akseleille nimet
//    xAkseli.setLabel("Vuosi");
//    yAkseli.setLabel("Sijoitus");

    // luodaan viivakaavio. Viivakaavion arvot annetaan numeroina
    // ja se käyttää aiemmin luotuja x- ja y-akseleita
    LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
    viivakaavio.setTitle("Puolueiden suhteellinen kannatus");

    // luodaan viivakaavioon lisättävä datajoukko
    XYChart.Series data;
    // lisätään datajoukkoon yksittäisiä pisteitä
    String puolueenLuvut[];
    ArrayList<Double> puolueenLuvutLista = new ArrayList<>();
    for (int i = 1; i < lista.size(); i++) {
        data = new XYChart.Series();
        data.setName(puolueet[i]);
        puolueenLuvut = lista.get(i).split("\t");
        for (int k = 1; k < 12; k++) {
            try {
                puolueenLuvutLista.add(Double.parseDouble(puolueenLuvut[k]));
            } catch (Exception e) {
                puolueenLuvutLista.add(0.0);
            }
        }
        for (int j = 0; j < puolueenLuvutLista.size(); j++) {
            if (puolueenLuvutLista.get(j) > 0) {
                data.getData().add(new XYChart.Data(vuodet.get(j), puolueenLuvutLista.get(j)));
            }
        }
        puolueenLuvutLista.removeAll(puolueenLuvutLista);
        viivakaavio.getData().add(data);
    }
//    data.getData().add(new XYChart.Data(2007, 73));
//    data.getData().add(new XYChart.Data(2008, 68));
//    data.getData().add(new XYChart.Data(2009, 72));
//    data.getData().add(new XYChart.Data(2010, 72));
//    data.getData().add(new XYChart.Data(2011, 74));
//    data.getData().add(new XYChart.Data(2012, 73));
//    data.getData().add(new XYChart.Data(2013, 76));
//    data.getData().add(new XYChart.Data(2014, 73));
//    data.getData().add(new XYChart.Data(2015, 67));
//    data.getData().add(new XYChart.Data(2016, 56));
//    data.getData().add(new XYChart.Data(2017, 56));

    // lisätään datajoukko viivakaavioon
    

    // näytetään viivakaavio
    Scene nakyma = new Scene(viivakaavio, 640, 480);
    ikkuna.setScene(nakyma);
    ikkuna.show();
}

    public static void main(String[] args) {
        launch(PuolueetSovellus.class);
    }

}
