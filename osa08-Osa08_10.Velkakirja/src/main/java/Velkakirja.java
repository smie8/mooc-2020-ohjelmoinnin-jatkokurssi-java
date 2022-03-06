import java.util.ArrayList;
import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Velkakirja {
    
    private HashMap<String,Double> lista;
    
    public Velkakirja() {
        this.lista = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara) {

        lista.put(kenelle, maara);
        
    }
    
    public double paljonkoVelkaa(String kuka) {
        if (lista.get(kuka) != null) {
            return lista.get(kuka);
        } else {
            return 0;
        }
    }
    
}
