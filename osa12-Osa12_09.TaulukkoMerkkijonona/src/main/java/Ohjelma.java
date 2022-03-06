
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa metodiasi täällä
        int[][] matriisi = {
        {3, 2, 7, 6},
        {2, 4, 1, 0},
        {3, 2, 1, 0}
};

System.out.println(taulukkoMerkkijonona(matriisi));
    }
    
    public static String taulukkoMerkkijonona(int[][] taulukko) {
         StringBuilder s = new StringBuilder();
         
         for (int i = 0; i < taulukko.length; i++) {
             for (int j = 0; j < taulukko[i].length; j++) {
                 int arvo = taulukko[i][j];
                 s.append(arvo);
             }
             s.append("\n");
         }
         
         return s.toString();
         
    }

}
