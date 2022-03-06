
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Putki<Luokkaparametri> {
    
    ArrayList<Luokkaparametri> putki;
    
    public Putki() {
        this.putki = new ArrayList<>();
    }
    
    public void lisaaPutkeen(Luokkaparametri arvo) {
        putki.add(0, arvo);
    }
    
    public Luokkaparametri otaPutkesta() {
        Luokkaparametri palautus = putki.get(putki.size()-1);
        putki.remove(putki.get(putki.size()-1));
        return palautus;
        
    }
    
    public boolean onkoPutkessa() {
        if (putki.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
}
