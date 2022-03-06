
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
        HashMap<String, String> hajautustaulu = new HashMap<>();
        hajautustaulu.put("matti", "mage");
        hajautustaulu.put("mikael", "mixu");
        hajautustaulu.put("arto", "arppa");
        System.out.println(hajautustaulu.get("mikael"));
    }

}
