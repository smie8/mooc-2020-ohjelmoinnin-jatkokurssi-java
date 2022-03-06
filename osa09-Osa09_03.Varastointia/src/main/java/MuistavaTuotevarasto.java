/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class MuistavaTuotevarasto extends Tuotevarasto {
    
    private Muutoshistoria historia;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.historia = new Muutoshistoria();
        this.historia.lisaa(alkuSaldo);
    }
    
    public String historia() {
        return this.historia.toString();
    }
    
    public void lisaaVarastoon(double maara) {
        
        super.lisaaVarastoon(maara);
        
        this.historia.lisaa(super.getSaldo());
        
        
//        if (maara < 0) {
//            return;
//        }
//        if (maara <= paljonkoMahtuu()) {
//            this.saldo = this.saldo + maara;
//        } else {
//            this.saldo = this.tilavuus;
//        }
    }
    
    public double otaVarastosta(double maara) {
        
        double saldo = super.getSaldo();
        double jaannos = 0.0;
        
        if (maara > saldo) {
            jaannos = saldo;
            this.historia.lisaa(0.0);
        } else {
            jaannos = saldo - maara;
            this.historia.lisaa(jaannos);
        }
        
        super.otaVarastosta(maara);
        return jaannos;
       
    }
    
    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + super.getNimi());
        System.out.println("Historia: " + this.historia.toString());
        System.out.println("Suurin tuotemäärä: " + this.historia.maxArvo());
        System.out.println("Pienin tuotemäärä: " + this.historia.minArvo());
        System.out.println("Keskiarvo: " + this.historia.keskiarvo());
    }
    
}
