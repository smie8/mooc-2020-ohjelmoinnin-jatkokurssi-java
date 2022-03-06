
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);

        // taikaneliön luominen Siamese method -algoritmilla
        // https://en.wikipedia.org/wiki/Siamese_method
        
        // ensimmäinen luku (1) asetetaan ylimmän rivin keskimmäiseen sarakkeeseen. 
        int luku = 1;
        int keskikohta = nelio.getLeveys() / 2;
        
        // alustetaan koordinaatit
        int x = keskikohta;
        int y = 0;
        
        nelio.asetaArvo(keskikohta, 0, luku);
        System.out.println("luku: " + luku + " koordinaatteihin: " + x + ", " + y);
        
        // taikaneliössä lukuja yhteensä (neliön pinta-ala):
        int lukujaYhteensa = koko * koko;
        
        while (luku < lukujaYhteensa) {
            
            // siirrytään seuraavaan asetettavaan lukuun
            luku++;
            
            // hypoteettisten koordinaattien alustus
            int hypoX = x;
            int hypoY = y;
            
            // jos hypoteettinen x (x + 1) liian suuri, asetetaan hypoteettinen x nollaksi, muussa tapauksessa kasvatetaan yhdellä
            if (hypoX + 1 >= nelio.getLeveys()) {
                hypoX = 0;
            } else {
                hypoX++;
            }

            // jos hypoteettinen y (y - 1) liian pieni, asetetaan hypoteettiselle y-koordinaatille suurin y:n arvo, muussa tapauksessa y:stä vähennetään yksi
            if (hypoY - 1 < 0) {
                hypoY = nelio.getKorkeus()-1;
            } else {
                hypoY--;
            }

            // katsotaan onko luvun hypoteettinen paikka vapaana
            if (nelio.annaArvo(hypoX, hypoY) == 0) {
                // on vapaana, joten asetetaan siihen luku, ja astetaan varsinainen x ja y vastaamaan tätä koordinaatiston pistettä
                x = hypoX;
                y = hypoY;
                nelio.asetaArvo(x, y, luku);
                System.out.println("luku: " + luku + " koordinaatteihin: " + x + ", " + y);


            // mikäli hypoteettinen paikka ei ole vapaana, asetetaan luku paikkaan: x, (y + 1)
            } else {
                y++;
                nelio.asetaArvo(x, y, luku);
                System.out.println("luku: " + luku + " koordinaatteihin: " + x + ", " + y);
            }
                       
        }     
        
        return nelio;
    }

}
