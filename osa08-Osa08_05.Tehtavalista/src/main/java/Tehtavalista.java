
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
public class Tehtavalista {
    
    private ArrayList<String> lista;
    
    public Tehtavalista() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        this.lista.add(tehtava);
    }
    
    public void tulosta() {
        for(int i = 1; i <= lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i-1));
        }
    }
    
    public void poista(int numero) {
        this.lista.remove(numero - 1);
    }
    
}
