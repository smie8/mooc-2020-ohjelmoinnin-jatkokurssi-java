/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Koira extends Elain implements Aanteleva {
    
    public Koira(String nimi) {
        super(nimi);
    }
    
    public Koira() {
        super("Koira");
    }
    
    public void hauku() {
        System.out.println(super.getNimi() + " haukkuu");
    }
    
    
//    public void syo() {
////        System.out.println(super.getNimi() + " syö");
//        super.syo();
//    }
//    
//    public void nuku() {
////        System.out.println(super.getNimi() + " nukkuu");
//        super.nuku();
//    }
    
    public void aantele() {
        this.hauku();
    }
    
}
