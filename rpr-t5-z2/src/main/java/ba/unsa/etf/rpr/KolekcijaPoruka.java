package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class KolekcijaPoruka {
    private ArrayList<String> poruke;

    public KolekcijaPoruka(ArrayList<InterfejsPredstavi> lista) {
        for (InterfejsPredstavi i : lista) {
            poruke.add(i.predstavi());
        }
    }
}
