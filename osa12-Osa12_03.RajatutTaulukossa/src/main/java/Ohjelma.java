
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        int[] taulu = new int[2];
        taulu[0] = 0;
        taulu[1] = 1;
        System.out.println(taulu.length);
    }
    
    public static int summa(int[] taulukko, int mista, int mihin, int pienin, int suurin) {
        if (mista < 0) {
            mista = 0;
        }
        
        if (mihin > taulukko.length-1) {
            mihin = taulukko.length-1;
        }
        
        int summa = 0;
        
        for (int i = mista; i <= mihin; i++) {
            if (taulukko[i] < suurin && taulukko[i] > pienin) {
                summa += taulukko[i];           
            }
        }
        
        return summa;
    }

}
