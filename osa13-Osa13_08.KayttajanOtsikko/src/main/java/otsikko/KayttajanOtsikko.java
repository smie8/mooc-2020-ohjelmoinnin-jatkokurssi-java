package otsikko;

import javafx.application.Application;
import javafx.stage.Stage;


public class KayttajanOtsikko extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        
        Parameters params = getParameters();
        String otsikko = params.getNamed().get("otsikko");
        
        ikkuna.setTitle(otsikko);
        ikkuna.show();
    }    
    
//    private Scanner lukija;
//    
//    public KayttajanOtsikko(Scanner lukija) {
//        this.lukija = lukija;
//    }
//    
//    public String kaynnista() {
//        System.out.println("Otsikko: ");
//        String otsikko = this.lukija.nextLine();
//        return otsikko;
//    }
    

    


}
