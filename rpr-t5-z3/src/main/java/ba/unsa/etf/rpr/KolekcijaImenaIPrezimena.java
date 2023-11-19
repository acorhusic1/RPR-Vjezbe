package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class KolekcijaImenaIPrezimena extends Kolekcija {
    private ArrayList<String> imena, prezimena;

    public KolekcijaImenaIPrezimena(ArrayList<String> imena, ArrayList<String> prezimena) {
        this.imena = imena;
        this.prezimena = prezimena;
    }

    public int getIndexNajduzegPara() {
        int maxIndex = 0;
        for (int i = 0; i < imena.size(); i++)
            if ((imena.get(i) + prezimena.get(i)).length() > (imena.get(maxIndex) + prezimena.get(maxIndex)).length())
                maxIndex = i;

        return maxIndex;
    }

    public String getImeIPrezime(int i) {
        return imena.get(i) + " " + prezimena.get(i);
    }
}
