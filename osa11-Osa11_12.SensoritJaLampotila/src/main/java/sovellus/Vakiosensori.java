/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

/**
 *
 * @author samie
 */
public class Vakiosensori implements Sensori {
    
    private int luku;
    
    public Vakiosensori(int luku) {
        this.luku = luku;
    }

    public boolean onPaalla() {
        return true;
    }
    
    public void paalle(){};
    public void poisPaalta(){};
    
    public int mittaa() {
        return this.luku;
    }
    
    
}
