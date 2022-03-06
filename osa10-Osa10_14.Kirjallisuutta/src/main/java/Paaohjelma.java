
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while (true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            String syote = lukija.nextLine();
            if (syote.equals("")) {
                break;
            }
            System.out.println("Syötä kirjan pienin kohdeikä: ");
            int kohdeika = Integer.valueOf(lukija.nextLine());
            kirjat.add(new Kirja(syote, kohdeika));
        }
        
        System.out.print("Yhteensä " + kirjat.size());
        if (kirjat.size() == 1) {
            System.out.println(" kirja");
        } else {
            System.out.println(" kirjaa");
        }
        
        System.out.println("Kirjat:");
        
        Comparator<Kirja> vertailija = Comparator
                .comparing(Kirja::getKohdeika)
                .thenComparing(Kirja::getNimi);
        
        Collections.sort(kirjat, vertailija);
        
        kirjat.stream()
//                .sorted((kirja1, kirja2) -> {
//                    return kirja1.getKohdeika() - kirja2.getKohdeika();
//                })
                .forEach(kirja -> System.out.println(kirja));
        
        
    }

}
