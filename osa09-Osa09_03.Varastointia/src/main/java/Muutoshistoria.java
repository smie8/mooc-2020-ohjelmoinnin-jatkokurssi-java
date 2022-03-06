
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
public class Muutoshistoria {
    
    private ArrayList<Double> lista;
    
    public Muutoshistoria() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(double tilanne) {
        this.lista.add(tilanne);
    }
    
    public void nollaa() {
        this.lista.removeAll(lista);
    }
    
    @Override
    public String toString() {
        
//        String historia = "";
//        
//        for (double historiatieto: this.lista) {
//            historia += historiatieto + "\n";
//        }
//        return historia;
        return this.lista.toString();
    }
    
    public double maxArvo() {
        if (this.lista.isEmpty()) {
            return 0;
        } else {
            double max = this.lista.get(0);
            
            for (int i = 0; i < this.lista.size(); i++) {
                if (this.lista.get(i) > max) {
                    max = this.lista.get(i);
                }
            }
            
            return max;
        }
    }
    
    public double minArvo() {
        if (this.lista.isEmpty()) {
            return 0;
        } else {
            double min = this.lista.get(0);
            
            for (int i = 0; i < this.lista.size(); i++) {
                if (this.lista.get(i) < min) {
                    min = this.lista.get(i);
                }
            }
            
            return min;
        }
    }
    
    public double keskiarvo() {
        if (this.lista.isEmpty()) {
            return 0;
        } else {
            int lkm = this.lista.size();
            double summa = 0;
            
            for (double historiatieto: this.lista) {
                summa += historiatieto;
            }
            
            return summa/lkm;
        }
    }
    
}
