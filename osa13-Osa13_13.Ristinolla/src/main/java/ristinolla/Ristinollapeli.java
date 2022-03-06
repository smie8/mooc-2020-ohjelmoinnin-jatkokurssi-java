/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristinolla;

/**
 *
 * @author samie
 */
class Ristinollapeli {
    
    private String vuoro;
    
    public Ristinollapeli() {
        this.vuoro = "X";
    }
    
    public String pelaavuoro() {
        if (this.vuoro.equals("X")) {
            this.vuoro = "O";
        } else {
            this.vuoro = "X";
        }
        
        return this.vuoro;
    }
    
}
