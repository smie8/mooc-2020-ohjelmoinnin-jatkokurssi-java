/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Sivari implements Palvelusvelvollinen {
    
    private int paivat;
    
    public Sivari() {
        this.paivat = 362;
    }
    
    public int paiviaJaljella() {
        return this.paivat;
    }
    
    public void palvele() {
        if (this.paivat > 0) {
            this.paivat--;
        }
    }
    
}
