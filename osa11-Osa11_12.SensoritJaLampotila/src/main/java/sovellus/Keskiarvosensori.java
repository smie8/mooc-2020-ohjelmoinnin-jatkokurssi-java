/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author samie
 */
public class Keskiarvosensori implements Sensori {
    
    private ArrayList<Sensori> sensorit;
    private ArrayList<Integer> mittaukset;
    
    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.mittaukset = new ArrayList<>();
    }

    public boolean onPaalla() {
        return this.sensorit.stream()
//                .filter(sensori -> !sensori.onPaalla())
                .allMatch(sensori -> sensori.onPaalla());
                
    }

    public void paalle() {
        for (Sensori s: this.sensorit) {
            s.paalle();
        }
    }

    public void poisPaalta() {
        for (Sensori s: this.sensorit) {
            s.poisPaalta();
        }
    }

    public int mittaa() {
        if (this.sensorit.size() < 1 || this.onPaalla() == false) {
            throw new IllegalStateException("Moga");
        }
        
        double ka = this.sensorit.stream()
                .mapToInt(sensori -> sensori.mittaa())
                .average()
                .getAsDouble();
        int ka2 = (int)ka;
        this.mittaukset.add(ka2);
        return ka2;
    }
    
    public void lisaaSensori(Sensori lisattava) {
        this.sensorit.add(lisattava);
    }
    
    public List<Integer> mittaukset() {
//        return this.sensorit.stream()
//                .map(sensori -> sensori.mittaa())
//                .collect(Collectors.toList());
        return this.mittaukset;
    }
    
    
    
}
