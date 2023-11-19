package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class KolekcijaImenaTest {

    @Test
    void getNajduzeIme() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("123");
        lista.add("124");
        KolekcijaImena kolekcija = new KolekcijaImena(lista);
        assertEquals("123", kolekcija.getNajduzeIme());
    }
}