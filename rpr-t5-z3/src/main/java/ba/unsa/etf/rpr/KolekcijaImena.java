package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class KolekcijaImena extends Kolekcija {
    private ArrayList<String> imena;

    public KolekcijaImena(ArrayList<String> imena) {
        this.imena = imena;
    }

    public String getNajduzeIme() {
        String najduze = new String();
        for (String s : imena)
            if (s.length() > najduze.length()) najduze = s;
        return najduze;
    }
}
