package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class KolekcijaImenaIPrezimenaTest {

    @Test
    void getIndexNajduzegPara() {
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        lista1.add("ime");
        lista2.add("prezime");
        lista1.add("imee");
        lista2.add("prezimee");
        lista1.add("im");
        lista2.add("prezim");
        KolekcijaImenaIPrezimena kolekcija = new KolekcijaImenaIPrezimena(lista1, lista2);
        assertEquals(1, kolekcija.getIndexNajduzegPara());
    }

    @Test
    void getImeIPrezime() {
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        lista1.add("ime");
        lista2.add("prezime");
        lista1.add("imee");
        lista2.add("prezimee");
        lista1.add("im");
        lista2.add("prezim");
        KolekcijaImenaIPrezimena kolekcija = new KolekcijaImenaIPrezimena(lista1, lista2);
        assertEquals("im prezim", kolekcija.getImeIPrezime(2));
    }
}