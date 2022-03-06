
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Sailio eka = new Sailio();
        Sailio toka = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + eka);
            System.out.println("Toinen: " + toka);

            String luettu = lukija.nextLine();
            
            String osat[] = luettu.split(" ");
            luettu = osat[0];
            int luku = 0;
            if (osat.length > 1) {
                luku = Integer.valueOf(osat[1]);
            }
            
            if (luettu.equals("lopeta")) {     
                break;
            } else if (luettu.contains("lisaa")) {
                eka.lisaa(luku);
                
            } else if (luettu.contains("siirra")) {
                if (luku < 0) {
                    break;
                }
                int erotus = eka.sisalto() - luku;
                if (erotus < 0) {
                    int siirrettava = luku - (luku-eka.sisalto());
                    eka.poista(luku);
                    toka.lisaa(siirrettava);
                } else {
                    eka.poista(luku);
                    toka.lisaa(luku);
                }

            } else if (luettu.contains("poista")) {
                toka.poista(luku);
            }
            

        }

    }

}
