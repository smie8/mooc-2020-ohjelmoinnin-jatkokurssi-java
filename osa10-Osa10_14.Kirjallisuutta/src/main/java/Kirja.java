/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Kirja {
    
    private String nimi;
    private int kohdeika;
    
    public Kirja(String nimi, int ika) {
        this.nimi = nimi;
        this.kohdeika = ika;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getKohdeika() {
        return this.kohdeika;
    }
    
    @Override
    public String toString() {
        return this.nimi + "(" + this.kohdeika + " vuotiaille ja vanhemmille)";
    }
    
}
