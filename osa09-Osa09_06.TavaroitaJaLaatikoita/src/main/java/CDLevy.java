/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class CDLevy implements Talletettava {
    
    private String artisti;
    private String levy;
    private int julkaisuvuosi;
    private double paino;
    
    public CDLevy(String artisti, String levy, int vuosi) {
        this.artisti = artisti;
        this.levy = levy;
        this.julkaisuvuosi = vuosi;
        this.paino = 0.1;
    }
    
    public double paino() {
        return this.paino;
    }
    
    @Override
    public String toString() {
        return this.artisti + ": " + this.levy + " (" + this.julkaisuvuosi + ")";
    }
    
}
