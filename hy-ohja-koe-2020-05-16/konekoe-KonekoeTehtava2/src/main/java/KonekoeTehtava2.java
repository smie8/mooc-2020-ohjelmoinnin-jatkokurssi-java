
import java.util.Scanner;

public class KonekoeTehtava2 {

    public static void main(String[] args) throws Salasanapoikkeus {
        Scanner lukija = new Scanner(System.in);
        
        SalainenPaivakirja pk = new SalainenPaivakirja("passu");
        
        while (true) {
            KonekoeTehtava2.ohjeet();
            String syote = lukija.nextLine();
            
            if (syote.equals("1")) {
                System.out.println("Syötä salasana: ");
                String salasana = lukija.nextLine();
                pk.tarkistaSalasana(salasana);                
            } else if (syote.equals("2")) {
                System.out.println("Kirjoita lisättävä merkintä:");
                String merkinta = lukija.nextLine();
                pk.lisaaMerkinta(merkinta);
            } else if (syote.equals("3")) {
                System.out.println("Tulostettavan merkinnän indeksi:");
                int i = Integer.parseInt(lukija.nextLine());
                pk.tulostaMerkinta(i);
            } else if (syote.equals("4")) {
                System.out.println("Kaikki merkinnät:");
                System.out.println(pk.kaikkiMerkinnat());
            } else if (syote.equals("5")) {
                System.out.println("Merkintöjen määrä:");
                System.out.println(pk.merkintojenMaara());
            } else if (syote.equals("6")) {
                System.out.println("Poistutaan päiväkirjasovelluksesta.");
                break;
            }
            
        }

    }
    
    public static void ohjeet() {
        System.out.println("1 - Syötä salasana\n2 - Lisää merkintä\n3 - Tulosta merkintä\n4 - Tulosta kaikki merkinnät\n5 - Tulosta merkintöjen määrä\n6 - Lopeta");
    }
}
