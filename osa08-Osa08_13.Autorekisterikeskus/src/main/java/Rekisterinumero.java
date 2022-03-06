
import java.util.Objects;

public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // oliomuuttujille on lisätty määre final, jolloin niiden arvoa ei asetuksen
    // jälkeen voi enää muuttaa
    private final String rekNro;
    private final String maa;
    private String omistaja;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }
//    
//    public void setOmistaja(String omistaja) {
//        this.omistaja = omistaja;
//    }
//    
//    public String getOmistaja() {
//        if (this.omistaja == null) {
//            return null;
//        }
//        return this.omistaja;
//    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.rekNro) + 89 * hash + Objects.hashCode(this.maa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rekisterinumero other = (Rekisterinumero) obj;
        if (!Objects.equals(this.rekNro, other.rekNro)) {
            return false;
        }
        if (!Objects.equals(this.maa, other.maa)) {
            return false;
        }
        return true;
    }

    
    

}
