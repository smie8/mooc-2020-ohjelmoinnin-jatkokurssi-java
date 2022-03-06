
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        tulostaTiedosto();
    }
    
    public static void tulostaTiedosto() {
        
        try {
            Files.lines(Paths.get("lukutaito.csv"))
                    .map(rivi -> rivi.split(","))
//                    .forEach(rivi -> System.out.println(rivi[0]));
                    .sorted((maa1, maa2) -> {
//                        return Integer.valueOf(maa1[5]) - Integer.valueOf(maa2[5]);
                        return Double.compare(Double.valueOf(maa1[5]), Double.valueOf(maa2[5]));

                    }).forEach(maa -> System.out.println(maa[3] + " (" + maa[4] + ")," + maa[2].substring(0, maa[2].length() - 4) + ", " + maa[5]));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
    }
}
