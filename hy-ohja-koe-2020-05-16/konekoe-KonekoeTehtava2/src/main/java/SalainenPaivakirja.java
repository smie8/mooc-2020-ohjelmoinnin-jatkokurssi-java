
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class SalainenPaivakirja implements Tallennin {
    
    private String salasana;
    private ArrayList<String> merkinnat;
    private boolean salasanaOikein;
    
    public SalainenPaivakirja(String salasana) {
        this.salasana = salasana;
        this.merkinnat = new ArrayList<>();
        this.salasanaOikein = false;
    }
    
    public void tarkistaSalasana(String yritys) throws Salasanapoikkeus {
        
        if (this.salasana.equals(yritys)) {
            this.salasanaOikein = true;
        } else {
            this.salasanaOikein = false;
            throw new Salasanapoikkeus("Väärä salasana");
        }
    }
    
    public void lisaaMerkinta(String merkinta) throws Salasanapoikkeus {
        
        if (salasanaOikein) {
            this.merkinnat.add(merkinta);
        } else {
            throw new Salasanapoikkeus("Väärä salasana");
        }
        
    }
    
    public void tulostaMerkinta(int indeksi) throws Salasanapoikkeus {
        
        if (salasanaOikein) {
            System.out.println(this.merkinnat.get(indeksi));
        } else {
            throw new Salasanapoikkeus("Väärä salasana");
        }
    }
    
    public ArrayList<String> kaikkiMerkinnat() throws Salasanapoikkeus {

        if (salasanaOikein) {
            return this.merkinnat;
        } else {
            throw new Salasanapoikkeus("Väärä salasana");
        }
    }
    
    public int merkintojenMaara() throws Salasanapoikkeus {
        
        if (salasanaOikein) {
            return this.merkinnat.size();
        } else {
            throw new Salasanapoikkeus("Väärä salasana");
        }
    }
    
}
