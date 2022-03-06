/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Lista<T> {
    
    private T[] arvot;
    public int arvoja;
    
    public Lista() {
        this.arvot = (T[]) new Object[10];
        this.arvoja = 0;
    }
    
    public void lisaa(T arvo) {
        // Kasvatetaan listan kokoa jos tarvis
        if (this.arvoja == this.arvot.length) {
            kasvata();
        }
        // Tämä tunkee arvon aina sen hetkiseen indeksiin
        this.arvot[this.arvoja] = arvo;
        // Listään indeksiä
        this.arvoja++;
    }
    
    public void kasvata() {
        int uusiKoko = this.arvot.length + this.arvot.length / 2;
        T[] uusi = (T[]) new Object[uusiKoko];
        for (int i = 0; i < this.arvot.length; i++) {
            uusi[i] = this.arvot[i];
        }
        
        this.arvot = uusi;
    }
    
    public boolean sisaltaa(T arvo) {
        return arvonIndeksi(arvo) >= 0;
    }
    
    public void poista(T arvo) {
        int arvonIndeksi = arvonIndeksi(arvo);
        if (arvonIndeksi < 0) {
            return;
        }
        
        siirraVasemmalle(arvonIndeksi);
        this.arvoja--;
    }
    
    private int arvonIndeksi(T arvo) {
        for (int i = 0; i < this.arvoja; i++) {
            if (this.arvot[i].equals(arvo)) {
                return i;
            }
        }
        
        return -1;
    }
    
    private void siirraVasemmalle(int indeksistaLahtien) {
        for (int i = indeksistaLahtien; i < this.arvoja - 1; i++) {
            this.arvot[i] = this.arvot[i + 1];
        }
    }
    
    public T arvo(int indeksi) {
        if (indeksi < 0 || indeksi >= this.arvoja) {
            throw new ArrayIndexOutOfBoundsException("Indeksi " + indeksi + " alueen [0, " + this.arvoja + "[ ulkopuolella.");
            
        }
        
        return this.arvot[indeksi];
    }
    
    public int koko() {
        return this.arvoja;
    }
    
    
}
