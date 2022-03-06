import java.util.ArrayList;
import java.util.Collections;
 
public class Taikanelio {
 
    private int[][] nelio;
 
    // valmis konstruktori
    public Taikanelio(int koko) {
        if (koko < 2) {
            koko = 2;
        }
 
        this.nelio = new int[koko][koko];
    }
 
    // toteuta nämä kolme metodia
    public ArrayList<Integer> rivienSummat() {
//        return new ArrayList<>();
        ArrayList<Integer> summat = new ArrayList<>();
        
        for (int i = 0; i < this.nelio.length; i++) {
            int rivisumma = 0;
            for (int j = 0; j < this.nelio[i].length; j++) {
                rivisumma += this.nelio[i][j];
            }
            summat.add(rivisumma);
        }
        
        return summat;
    }
 
    public ArrayList<Integer> sarakkeidenSummat() {
//        return new ArrayList<>();
        ArrayList<Integer> summat = new ArrayList<>();
        
        for (int i = 0; i < this.nelio.length; i++) {
            
            int summa = 0;
            
            for (int j = 0; j < this.nelio.length; j++) {
                summa += this.nelio[j][i];
                
            }
            summat.add(summa);
            
        }
        
        return summat;
    }
 
    public ArrayList<Integer> lavistajienSummat() {
        ArrayList<Integer> summat = new ArrayList<>();
        
        int summa = 0;
        for (int i = 0; i < this.nelio.length; i++) {
            summa += this.nelio[i][i];     
        }
        summat.add(summa);
        
        int summa2 = 0;
        
        for (int i = this.nelio.length-1; i >= 0; i--) {
            summa2 += this.nelio[i][(this.nelio.length-1) - i];
        }
        summat.add(summa2);
//        
        return summat;
    }
 
    // valmiit apumetodit -- älä koske näihin
    public boolean onTaikanelio() {
        return summatSamat() && kaikkiNumerotEri();
    }
 
    public ArrayList<Integer> annaKaikkiNumerot() {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                numerot.add(nelio[rivi][sarake]);
            }
        }
 
        return numerot;
    }
 
    public boolean kaikkiNumerotEri() {
        ArrayList<Integer> numerot = annaKaikkiNumerot();
 
        Collections.sort(numerot);
        for (int i = 1; i < numerot.size(); i++) {
            if (numerot.get(i - 1) == numerot.get(i)) {
                return false;
            }
        }
 
        return true;
    }
 
    public boolean summatSamat() {
        ArrayList<Integer> summat = new ArrayList<>();
        summat.addAll(rivienSummat());
        summat.addAll(sarakkeidenSummat());
        summat.addAll(lavistajienSummat());
 
        if (summat.size() < 3) {
            return false;
        }
 
        for (int i = 1; i < summat.size(); i++) {
            if (summat.get(i - 1) != summat.get(i)) {
                return false;
            }
        }
 
        return true;
    }
 
    public int annaArvo(int x, int y) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return - 1;
        }
 
        return this.nelio[y][x];
    }
 
    public void asetaArvo(int x, int y, int arvo) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return;
        }
 
        this.nelio[y][x] = arvo;
    }
 
    public int getLeveys() {
        return this.nelio.length;
    }
 
    public int getKorkeus() {
        return this.nelio.length;
    }
 
    @Override
    public String toString() {
        StringBuilder palautus = new StringBuilder();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                palautus.append(nelio[rivi][sarake]).append("\t");
            }
 
            palautus.append("\n");
        }
 
        return palautus.toString();
    }
}