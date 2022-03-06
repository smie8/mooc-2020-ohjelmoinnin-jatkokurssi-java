
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
public class MaksimipainollinenLaatikko extends Laatikko {
    
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaa(Tavara tavaraa) {
        
        int paino = 0;
        for (Tavara tavara: this.tavarat) {
            paino += tavara.getPaino();
        }
        
        if (paino + tavaraa.getPaino() <= this.maksimipaino) {
            this.tavarat.add(tavaraa);
        }
    }
    
    public boolean onkoLaatikossa(Tavara tavara) {
        if (this.tavarat.contains(tavara)) {
            return true;
        } else {
            return false;
        }
    }
    
}
