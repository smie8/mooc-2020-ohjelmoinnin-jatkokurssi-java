/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Sailio {
    
    private int nesteenMaara;
    
    public Sailio() {
        this.nesteenMaara = 0;
    }
    
    public int sisalto() {
        return this.nesteenMaara;
    }
    
    public void lisaa(int maara) {
        if (maara >= 0) {
            this.nesteenMaara += maara;
            if (this.nesteenMaara > 100) {
                this.nesteenMaara = 100;
            }
        }
    }
    
    public void poista(int maara) {
        if (maara > 0) {
            this.nesteenMaara -= maara;
            if (this.nesteenMaara < 0) {
                this.nesteenMaara = 0;
            }
        }
    }
    
    @Override
    public String toString() {
        return this.sisalto() + "/100";
    }
    
}
