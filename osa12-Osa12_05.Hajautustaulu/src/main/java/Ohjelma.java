
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        


        
        //Hajautustaulu<Integer, Integer> testitaulu = new Hajautustaulu<>();
        Hajautustaulu taulu = new Hajautustaulu<>();
        taulu.lisaa(1, "jee");
//        
//        int toka = testitaulu.hae(2);
        System.out.println(taulu.hae(1));
//        System.out.println(toka);
//        testitaulu.poista(2);
        //System.out.println(testitaulu.hae(2));
    }

}
