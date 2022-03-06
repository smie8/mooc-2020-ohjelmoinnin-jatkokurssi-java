
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KirjatTiedostosta {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

    }
    
    public static List<Kirja> lueKirjat(String tiedosto) {
        List<Kirja> kirjat = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(tiedosto))
                    .map(rivi -> rivi.split(","))
                    .map(osat -> new Kirja(osat[0], Integer.valueOf(osat[1]), Integer.valueOf(osat[2]), osat[3]))
                    .forEach(kirja -> kirjat.add(kirja));
            
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        return kirjat;
    }

}
