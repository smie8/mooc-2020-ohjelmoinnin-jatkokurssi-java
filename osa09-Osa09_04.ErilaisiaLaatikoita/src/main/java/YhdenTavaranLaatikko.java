
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
public class YhdenTavaranLaatikko extends Laatikko {
    
    private ArrayList<Tavara> tavarat;
    
    public YhdenTavaranLaatikko() {
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaa(Tavara tavara) {
        if (tavarat.size() == 0) {
            this.tavarat.add(tavara);
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
