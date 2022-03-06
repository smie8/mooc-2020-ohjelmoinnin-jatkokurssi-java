package lentokentta;

import java.util.Scanner;
import lentokentta.logiikka.Lentohallinta;
import lentokentta.ui.Tekstikayttoliittyma;


public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Lentohallinta hallinta = new Lentohallinta();
        Scanner lukija = new Scanner(System.in);
        Tekstikayttoliittyma ui = new Tekstikayttoliittyma(hallinta, lukija);
        ui.kaynnista();
    }
}
