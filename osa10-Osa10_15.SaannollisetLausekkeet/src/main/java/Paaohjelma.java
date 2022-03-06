
import java.util.Scanner;



public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja    
        
        Scanner lukija = new Scanner(System.in);
        
//        System.out.println("Anna merkkijono: ");
        String mj = "20:00:00";
        Tarkistin t = new Tarkistin();
        System.out.println(t.kellonaika(mj));
        
                
    }
}
