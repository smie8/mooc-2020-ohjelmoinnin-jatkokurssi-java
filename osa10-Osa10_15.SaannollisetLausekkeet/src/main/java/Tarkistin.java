

public class Tarkistin {
    
    public boolean onViikonpaiva(String merkkijono) {
        if (merkkijono.matches("ma|ti|ke|to|pe|la|su")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean kaikkiVokaaleja(String merkkijono) {
        if (merkkijono.matches("[a|e|i|o|u|y|ä|ö]*")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean kellonaika(String merkkijono) {
        // tt:mm:ss
        if (merkkijono.matches("(([0-1][0-9])|(20|21|22|23)):[0-5][0-9]:[0-5][0-9]")) {
            return true;
        } else {
            return false;
        }
    }

}
