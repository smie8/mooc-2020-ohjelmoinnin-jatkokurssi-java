package sovellus;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayttoliittyma {

    private Scanner lukija;
    private TodoDao tietokanta;

    public Kayttoliittyma(Scanner lukija, TodoDao tietokanta) {
        this.lukija = lukija;
        this.tietokanta = tietokanta;
    }

    public void kaynnista() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Syötä komento:");
            System.out.println("1) listaa");
            System.out.println("2) lisää");
            System.out.println("3) aseta tehdyksi");
            System.out.println("4) poista");
            System.out.println("x) lopeta");

            System.out.print("> ");
            String komento = this.lukija.nextLine();
            if (komento.equals("x")) {
                break;
            } else if (komento.equals("1")) {
                List<Todo> todot = tietokanta.listaa();
                System.out.println("Listataan tietokannan tiedot");
                for (Todo homma: todot) {
                    System.out.println(homma);
                }
                
            } else if (komento.equals("2")) {
                System.out.println("Lisätään tehtävää");
                System.out.println("Syötä nimi");
                String nimi = lukija.nextLine();
                System.out.println("Syötä kuvaus");
                String kuvaus = lukija.nextLine();
                tietokanta.lisaa(new Todo(nimi, kuvaus, false));
            } else if (komento.equals("3")) {
                System.out.println("Mikä asetetaan tehdyksi (syötä id)?");
                int id = Integer.parseInt(lukija.nextLine());
                tietokanta.asetaTehdyksi(id);
            } else if (komento.equals("4")) {
                System.out.println("Mikä poistetaan (syötä id)?");
                int id = Integer.parseInt(lukija.nextLine());
                tietokanta.poista(id);
            }

            // toteuta toiminnallisuus tänne
            
        }

        System.out.println("Kiitos!");
    }

}
