/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Kuutio implements Muoto {
    
    private int sivunPituus;
    
    public Kuutio(int sivunPituus) {
        this.sivunPituus = sivunPituus;
    }
    
    public int annaAla() {
        return (this.sivunPituus * this.sivunPituus * 6);
    }
    
    public int annaTilavuus() {
        return (this.sivunPituus * this.sivunPituus * this.sivunPituus);
    }
            
    
}
