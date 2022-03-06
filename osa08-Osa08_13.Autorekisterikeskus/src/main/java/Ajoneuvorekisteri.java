
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Ajoneuvorekisteri {
    
    private HashMap<Rekisterinumero, String> omistajat;
    
    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {

        if (this.omistajat.get(rekkari) == null) {
            this.omistajat.put(rekkari, omistaja);
            return true;
        } else {
            return false;
        }
        
    }
    
    public String hae(Rekisterinumero rekkari) {
       if (this.omistajat.containsKey(rekkari)) {
           return this.omistajat.get(rekkari);
       } else {
           return null;
       }
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        if (this.omistajat.containsKey(rekkari)) {
            this.omistajat.remove(rekkari);
            return true;
        } else {
            return false;
        }
    }
    
    public void tulostaOmistajat() {
        
        ArrayList<String> omistajalista = new ArrayList<>();
        
        for (Rekisterinumero rek: this.omistajat.keySet()) {
            if (!(omistajalista.contains(this.omistajat.get(rek)))) {
                omistajalista.add(this.omistajat.get(rek));
            }
        }
        
        for (String omistaja: omistajalista) {
            System.out.println(omistaja);
        }
    }
    
    public void tulostaRekisterinumerot() {
        for (Rekisterinumero rekkari: this.omistajat.keySet()) {
            System.out.println(rekkari);
        }
    }
    
}
