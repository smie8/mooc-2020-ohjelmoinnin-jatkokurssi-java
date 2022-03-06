
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String syote = lukija.nextLine();
            
            if (!syote.equals("loppu")) {
                int luku = Integer.valueOf(syote);
                System.out.println(luku*luku*luku);
            } else {
                break;
            }
        }
    }
}
