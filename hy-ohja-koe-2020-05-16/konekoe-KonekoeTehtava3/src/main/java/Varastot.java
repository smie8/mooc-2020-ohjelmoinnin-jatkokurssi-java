
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
public class Varastot {
    
    private ArrayList<Varasto> varastot;
    
    public Varastot() {
        this.varastot = new ArrayList<>();
    }
    
    public Varasto haeVarasto(String varastonNimi) throws Exception {
        
        // Katsotaan ensin onko varasto jo listassa
        for (Varasto varasto: this.varastot) {
            if (varastonNimi.equals(varasto.getNimi())) {
                return varasto;
            }
        }
        
        // Jos varasto ei ole listassa, lisätään se sinne
        Varasto uusiVarasto = new Varasto(varastonNimi);
        this.varastot.add(uusiVarasto);
        
        return uusiVarasto;
       
    }
    
    
    
}
