
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
public class Lyhenteet {
    
    private HashMap<String,String> map;
    
    public Lyhenteet() {
        this.map = new HashMap<>();
    }
    
    public void lisaaLyhenne(String lyhenne, String selite) {
        this.map.put(lyhenne, selite);
    }
    
    public boolean onkoLyhennetta(String lyhenne) {
        return this.map.containsKey(lyhenne);
    }
    
    public String haeLyhenne(String lyhenne) {
        if (!this.map.containsKey(lyhenne)) {
            return null;
        } else {
            return this.map.get(lyhenne);
        }
    }
    
}
