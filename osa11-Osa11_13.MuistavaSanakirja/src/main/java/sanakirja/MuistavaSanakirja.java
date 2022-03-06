/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author samie
 */
public class MuistavaSanakirja {
    
    private HashMap<String, String> sanat1;
    private HashMap<String, String> sanat2;
    private String tiedosto;
    private Scanner tiedostonlukija;
    
    public MuistavaSanakirja() {
        this.sanat1 = new HashMap<>();
        this.sanat2 = new HashMap<>();
        
    }
    
    public MuistavaSanakirja(String tiedosto) {
        this.tiedosto = tiedosto;
        this.sanat1 = new HashMap<>();
        this.sanat2 = new HashMap<>();
        
    }
    
    public boolean lataa() {
        try (Scanner tiedostonlukija = new Scanner(Paths.get(this.tiedosto))) {
            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();
                String[] osat = rivi.split(":");
//                System.out.println(osat[0]);
//                System.out.println(osat[1]);
                this.lisaa(osat[0], osat[1]);
                
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean tallenna() {
        try {
            PrintWriter kirjoittaja = new PrintWriter(this.tiedosto);
            for (String sana: this.sanat1.keySet()) {
                kirjoittaja.print(this.sanat1.get(sana) + ":");
                kirjoittaja.println(sana);
            }
            kirjoittaja.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public void lisaa(String sana, String kaannos) {
        sanat1.putIfAbsent(sana, kaannos);
        sanat2.putIfAbsent(kaannos, sana);
    }
    
    public String kaanna(String sana) {
        if (sanat1.containsKey(sana)) {
            return sanat1.get(sana);
        } else if (sanat2.containsKey(sana)) {
            return sanat2.get(sana);
        }   else {
            return null;
        }
    }
    
    public void poista(String sana) {
        if (sanat1.containsKey(sana)) {
            sanat2.remove(sanat1.get(sana));
            sanat1.remove(sana);
            
        }
        
        if (sanat2.containsKey(sana)) {
            sanat1.remove(sanat2.get(sana));
            sanat2.remove(sana);
        }         
    }
    
}
