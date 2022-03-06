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
public class Lampomittari implements Sensori {
    
    private boolean tila;
    
    public Lampomittari() {
        this.tila = false;
    }
    
    public boolean onPaalla() {
        return this.tila;
    }
    
    public void poisPaalta() {
        this.tila = false;
    }
    
    public void paalle() {
        this.tila = true;
    }
    
    public int mittaa() {
        if (!tila) {
            throw new IllegalStateException("Virhe");
        }
        
        return -30 + (int)(Math.random() * ((30 - -30) + 1));
    }
    
}
