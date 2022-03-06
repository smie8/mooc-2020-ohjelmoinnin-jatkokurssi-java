
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
public class Varasto {
    
    private String varastonNimi;
    private ArrayList<String> esineet;
    
    public Varasto(String nimi) {
        this.varastonNimi = nimi;
        this.esineet = new ArrayList<>();
    }
    
    public String getNimi() {
        return this.varastonNimi;
    }
    
    public void lisaa(String esine) {
        this.esineet.add(esine);
    }
    
    public void listaa() {
        System.out.println("Listataan varaston " + this.varastonNimi + " sisältö");
        for (String esine: this.esineet) {
            System.out.println("\t" + esine);
        }
    }
    
    public void hae(String esine) {
        if (this.esineet.contains(esine)) {
            System.out.println("Esine " + esine + " löytyy varastosta " + this.varastonNimi);
        } else {
            System.out.println("Esinettä " + esine + " ei löydy varastosta " + this.varastonNimi);
        }
    }
    
    public void poista(String esine) {
        if (this.esineet.contains(esine)) {
            this.esineet.remove(esine);
            System.out.println("Esine " + esine + " poistettu varastosta " + this.varastonNimi);
        } else {
            System.out.println("Esinettä " + esine + " ei löydy varastosta " + this.varastonNimi);
        }
    }
    
}
