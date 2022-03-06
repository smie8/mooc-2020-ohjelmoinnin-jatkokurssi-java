
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;
    private Random arvontakone;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.numerot = new ArrayList<>();
        this.arvontakone = new Random();
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
        int i = 0;
        while (true) {
            int numero = arvontakone.nextInt(40)+1;
            if (!sisaltaaNumeron(numero)) {
                this.numerot.add(numero);
                i++;
            }
            
            if (i == 7) {
                break;
            }
        }

        
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        if (this.numerot.contains(numero)) {
            return true;
        } else {
            return false;
        }
    }
}
