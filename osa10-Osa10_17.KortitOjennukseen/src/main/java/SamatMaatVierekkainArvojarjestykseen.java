
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {
    
    @Override
    public int compare(Kortti k1, Kortti k2) {
        if (k1.getMaa() == k2.getMaa()) {
            return k1.getArvo() - k2.getArvo();
        }
        
        return k1.getMaa().compareTo(k2.getMaa());
    }
}
