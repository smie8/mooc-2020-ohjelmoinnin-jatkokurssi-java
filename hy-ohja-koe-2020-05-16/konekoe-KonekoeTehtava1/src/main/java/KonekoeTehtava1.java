
import java.util.Scanner;

public class KonekoeTehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int pituus = 30;
        Kuutio k = new Kuutio(pituus);
        System.out.println("Kuution sivun pituus: " + pituus);
        System.out.println("Kuution ala: " + k.annaAla());
        System.out.println("Kuution tilavuus: " + k.annaTilavuus());
        
    }

}
