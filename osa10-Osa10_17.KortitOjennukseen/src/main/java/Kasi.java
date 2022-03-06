
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Kasi implements Comparable<Kasi> {
    
    private ArrayList<Kortti> lista;
    
    public Kasi() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti) {
        this.lista.add(kortti);
    }
    
    public void tulosta() {
        this.lista.stream().forEach(k -> System.out.println(k));
    }
    
    public ArrayList getLista() {
        return this.lista;
    }
    
    public void jarjesta() {
        ArrayList<Kortti> uudet = this.lista.stream()
                .sorted().collect(Collectors.toCollection(ArrayList::new));
        
        this.lista = uudet;
    }
    
    private int arvojenSumma() {
        int summa = 0;
        
        for (Kortti k : lista) {
            summa += k.getArvo();
            
        }
        
        return summa;
    }
    
    public void jarjestaMaittain() {
        Collections.sort(lista, new SamatMaatVierekkainArvojarjestykseen());
    }
    
    @Override
    public int compareTo(Kasi kasi) {
        return this.arvojenSumma() - kasi.arvojenSumma();
    }
}
