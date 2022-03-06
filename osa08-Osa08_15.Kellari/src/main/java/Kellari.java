
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
public class Kellari {
    
    private HashMap<String, ArrayList<String>> lista;
    
    public Kellari() {
        this.lista = new HashMap<>();
    }
    
    public void lisaa(String komero, String tavara) {
        this.lista.putIfAbsent(komero, new ArrayList<>());
        this.lista.get(komero).add(tavara);
    }
    
    public ArrayList<String> sisalto(String komero) {
        if (this.lista.containsKey(komero)) {
            return this.lista.get(komero);
        } else {
            return new ArrayList<>();
        }
    }
    
    public void poista(String komero, String tavara) {
        this.lista.get(komero).remove(tavara);
        if (this.lista.get(komero).size() == 0) {
            this.lista.remove(komero);
        }
    }
    
    public ArrayList<String> komerot() {
        ArrayList<String> lista = new ArrayList<>();
        for (String komero: this.lista.keySet()) {
            lista.add(komero);
        }
        
        return lista;
    }
    
}
