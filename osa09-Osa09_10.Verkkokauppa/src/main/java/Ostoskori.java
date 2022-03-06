
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Ostoskori {
    
    private Map<String, Ostos> lista;
    
    public Ostoskori() {
        this.lista = new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta) {
        if (this.lista.containsKey(tuote)) {
            this.lista.get(tuote).kasvataMaaraa();
        } else {
            this.lista.put(tuote, new Ostos(tuote, 1, hinta));
        }
    }
    
    public int hinta() {
        int hinta = 0;
        for (Ostos ostos: this.lista.values()) {
            hinta += ostos.hinta();
        }
        
        return hinta;
    }
    
    public void tulosta() {
        for (Ostos ostos: this.lista.values()) {
            System.out.println(ostos);
        }
    }
    
}
