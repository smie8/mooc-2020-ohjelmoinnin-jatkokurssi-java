
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> sanat = new ArrayList<>();
        while (true) {
            String syote = lukija.nextLine();
            if (syote.length() == 0) {
                break;
            }
            sanat.add(syote);
        }
        
        sanat.stream()
                .forEach(sana -> System.out.println(sana));
    }
}
