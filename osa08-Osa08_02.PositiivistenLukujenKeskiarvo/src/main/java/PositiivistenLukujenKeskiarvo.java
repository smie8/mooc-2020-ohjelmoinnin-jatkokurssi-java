
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int lkm = 0;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            } else if (luku > 0) {
                lkm++;
                summa += luku;
            }   
        }
        
        if (lkm > 0) {
            System.out.println(summa*1.0/lkm);
        } else {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }

    }
}
