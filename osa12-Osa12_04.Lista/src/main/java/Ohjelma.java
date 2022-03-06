
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä

        Lista<Integer> lista = new Lista();
        lista.lisaa(1);
        lista.lisaa(2);
        lista.lisaa(3);
        lista.poista(2);
        System.out.println(lista.sisaltaa(2));
        System.out.println(lista.sisaltaa(1));
        for (int i = 0; i < lista.koko(); i++) {
            System.out.println(i);
        }
    }

}
