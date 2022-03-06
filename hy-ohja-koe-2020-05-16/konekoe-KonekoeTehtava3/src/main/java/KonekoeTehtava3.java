
import java.util.Scanner;

public class KonekoeTehtava3 {

    public static void main(String[] args) throws Exception {
        Scanner lukija = new Scanner(System.in);
        Varastot varastot = new Varastot();
        
        System.out.println("Varastonhallinta!");
        
        System.out.println("\nKomennot:\n\tlisaa (varasto) (esine) -- lisää esineen varastoon\n\tlistaa (varasto) -- listaa kaikki annetun varaston esineet\n\thae (varasto) (esine) -- kertoo onko varastossa haettua esinettä\n\tpoista (varasto) (esine) -- poistaa yhden esineen annetusta varastosta\n\tlopeta -- lopettaa ohjelman suorituksen");
        
        while (true) {
            System.out.println("\nSyötä komento:");
            String komento = lukija.nextLine();
            
            String palat[] = komento.split(" ");
            
            if (komento.equals("lopeta")) {
                System.out.println("Kiitos!");
                break;
            } else if (palat[0].equals("lisaa")) {
                
                // varasto = palat[1]
                // esine = palat[2]
                varastot.haeVarasto(palat[1]).lisaa(palat[2]);
                
                
            } else if (palat[0].equals("listaa")) {
                
                // varasto = palat[1]
                varastot.haeVarasto(palat[1]).listaa();
                
            } else if (palat[0].equals("hae")) {
                
                // varasto = palat[1]
                // esine = palat[2]
                varastot.haeVarasto(palat[1]).hae(palat[2]);
                
            } else if (palat[0].equals("poista")) {
                
                // varasto = palat[1]
                // esine = palat[2]
                varastot.haeVarasto(palat[1]).poista(palat[2]);
                
            } else {
                System.out.println("Tuntematon komento " + komento);
            }
            
        }

    }

}
