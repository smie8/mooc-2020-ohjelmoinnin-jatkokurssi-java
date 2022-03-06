
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Tyontekijat {
    
    private ArrayList<Henkilo> lista;
    
    public Tyontekijat() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(Henkilo lisattava) {
        this.lista.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattavat) {
        lisattavat.stream()
                .forEach(hlo -> this.lista.add(hlo));
    }
    
    public void tulosta() {
        
        Iterator<Henkilo> iteraattori = this.lista.iterator();
        
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }
        
//        lista.stream().forEach(tt -> System.out.println(tt));
    }
    
    public void tulosta(Koulutus koulutus) {
        
        Iterator<Henkilo> iteraattori = this.lista.iterator();

        while (iteraattori.hasNext()) {
            Henkilo seuraava = iteraattori.next();

            if(seuraava.getKoulutus() == koulutus) {
                System.out.println(seuraava);     
            }

//            System.out.println(seuraava);
            

//            System.out.println(seuraava.ordinal());
//            System.out.println(koulutus.ordinal());
        }
        
//        lista.stream()
//                .map(hlo -> hlo.getKoulutus() == koulutus)
//                .forEach(tt -> System.out.println(tt));
    }
    
    public void irtisano(Koulutus koulutus) {
        
        Iterator<Henkilo> iteraattori = this.lista.iterator();

        while (iteraattori.hasNext()) {
            if(iteraattori.next().getKoulutus() == koulutus) {
                iteraattori.remove();
            }
        }
        
//        lista.stream()
//                .map(hlo -> hlo.getKoulutus() == koulutus)
//                .forEach(tt -> System.out.println(tt));
    }
    
}
