
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
interface Tallennin {
    void lisaaMerkinta(String merkinta) throws Salasanapoikkeus;
    void tulostaMerkinta(int indeksi) throws Salasanapoikkeus;
    ArrayList<String> kaikkiMerkinnat() throws Salasanapoikkeus;
    int merkintojenMaara() throws Salasanapoikkeus;
}