
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
public class Laatikko implements Talletettava {
    
    private ArrayList<Talletettava> lista;
    private double maxpaino;

    
    public Laatikko(double maxpaino) {
        this.lista = new ArrayList<>();
        this.maxpaino = maxpaino;
     
    }
    
    public void lisaa(Talletettava kama) {
        
        if (this.maxpaino >= (this.paino() + kama.paino())) {
            this.lista.add(kama);
//            this.paino += kama.paino();
        }
    }
    
    public double paino() {
        double paino = 0;
        
        for (Talletettava kama: this.lista) {
            paino += kama.paino();
        }
        
        return paino;
    }
    
    @Override
    public String toString() {
        return "Laatikko: " + this.lista.size() + " esinettä, paino yhteensä " + this.paino() + " kiloa";
    }
    
}
