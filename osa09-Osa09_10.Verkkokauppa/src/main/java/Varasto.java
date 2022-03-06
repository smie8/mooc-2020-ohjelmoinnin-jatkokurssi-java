
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Varasto {
    
    private Map<String, Integer> lista;
    private Map<String, Integer> listaSaldo;
    
    public Varasto() {
        this.lista = new HashMap<>();
        this.listaSaldo = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.lista.put(tuote, hinta);
        this.listaSaldo.put(tuote, saldo);
    }
    
    public int hinta(String tuote) {
        if (this.lista.containsKey(tuote)) {
            return this.lista.get(tuote);
        } else {
            return -99;
        }
    }
    
    public int saldo(String tuote) {
        if (this.listaSaldo.containsKey(tuote)) {
            return this.listaSaldo.get(tuote);
        } else {
            return 0;
        }
    }
    
    public boolean ota(String tuote) {
        if (this.listaSaldo.containsKey(tuote) && this.listaSaldo.get(tuote) > 0) {
            this.listaSaldo.put(tuote, this.listaSaldo.get(tuote)-1);
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> tuotteet() {
        Set<String> tuotteet = new HashSet<>();
        for (String tuote: this.lista.keySet()) {
            tuotteet.add(tuote);
        }
        return tuotteet;
    }
    
}
