

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia7
        
Ostoskori kori = new Ostoskori();
kori.lisaa("maito", 3);
kori.lisaa("piima", 2);
kori.lisaa("juusto", 5);
System.out.println("korin hinta: " + kori.hinta());
kori.lisaa("tietokone", 899);
System.out.println("korin hinta: " + kori.hinta());
    }
}
