
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        ArrayList<String> syotteet = new ArrayList<>();
        
        while (true) {
            String syote = lukija.nextLine();
            
            if (syote.equals("loppu")) {
                break;
            }
            
            syotteet.add(syote);
            
            
        }
        
        double kaN = syotteet.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku < 0)
                .average()
                .getAsDouble();
        
        double kaP = syotteet.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku >= 0)
                .average()
                .getAsDouble();
        
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String np = lukija.nextLine();
        
        if (np.equals("n")) {
            System.out.println("Negatiivisten lukujen keskiarvo: " + kaN);
        } else if (np.equals("p")) {
            System.out.println("Positiivisten lukujen keskiarvo: " + kaP);
        }
        
    }
}
