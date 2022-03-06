
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Kayttoliittyma {
    
    private Tehtavalista lista;
    private Scanner lukija;
    
    public Kayttoliittyma(Tehtavalista lista, Scanner lukija) {
        this.lista = lista;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.print("Komento: ");
            String syote = this.lukija.nextLine();
           
            if (syote.equals("lopeta")) {
                break;
            } else if (syote.equals("lisaa")) {
                System.out.print("Lisättävä: ");
                String lisattava = this.lukija.nextLine();
                lista.lisaa(lisattava);
            } else if (syote.equals("listaa")) {
                lista.tulosta();
            } else if (syote.equals("poista")) {
                int poistettava = Integer.valueOf(this.lukija.nextLine());
                lista.poista(poistettava);
            }
            
            
        }
    }
    
}
