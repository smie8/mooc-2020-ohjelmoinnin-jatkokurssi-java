
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int eka = 0;
        int toka = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + eka + "/100");
            System.out.println("Toinen: " + toka + "/100");

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
                if (luku < 0) {
                    break;
                }
                
                if (eka + luku >= 100) {
                    eka =  100;
                } else {
                    eka += luku;
                }
            } else if (luettu.contains("siirra")) {
                if (luku < 0) {
                    break;
                }
                int erotus = eka - luku;
                if (erotus < 0) {
                    
                    int siirrettava = luku - (luku-eka);
                    eka = 0;
                    if (toka + siirrettava >= 100) {
                        toka = 100;
                    } else {
                        toka += siirrettava;
                    }               
                } else {
                    eka -= luku;
                    if (toka + luku >= 100) {
                        toka = 100; 
                    } else {
                        toka += luku;
                    }
                }
            } else if (luettu.contains("poista")) {
                if (luku < 0) {
                    break;
                }
                if (toka - luku <= 0) {
                    toka = 0;
                } else {
                    toka -= luku;
                }
            }
            

        }
    }

}
