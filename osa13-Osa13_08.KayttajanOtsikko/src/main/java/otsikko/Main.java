package otsikko;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String otsikko = lukija.nextLine();
        //KayttajanOtsikko ots = new KayttajanOtsikko(lukija);
        Application.launch(KayttajanOtsikko.class,
                "--otsikko=" + otsikko);

    }

}
