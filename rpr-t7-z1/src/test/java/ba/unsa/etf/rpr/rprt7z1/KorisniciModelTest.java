package ba.unsa.etf.rpr.rprt7z1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorisniciModelTest {
    @Test
    public void testKonstruktor() {
        KorisniciModel testni = new KorisniciModel();
        assertEquals(0, testni.getKorisnici().size());
    }
    @Test
    public void testNapuni() {
        KorisniciModel testni = new KorisniciModel();
        testni.napuni();
        assertEquals(testni.getTrenutniKorisnik().getIme(), "Miki");
    }
    @Test
    public void testSetTrenutniKorisnik() {
        KorisniciModel testni = new KorisniciModel();
        testni.setTrenutniKorisnik(new Korisnik("Ahmed", "Corhusic", "acorhusic1@etf.unsa.ba", "acorhusic1", "abcdef"));
        assertEquals("abcdef", testni.getTrenutniKorisnik().getLozinka());
    }
    @Test
    public void testAdd() {
        KorisniciModel testni = new KorisniciModel();
        testni.add(new Korisnik("Ahmed", "Corhusic", "acorhusic1@etf.unsa.ba", "acorhusic1", "abcdef"));
        assertEquals("acorhusic1@etf.unsa.ba", testni.getTrenutniKorisnik().getEmail());
    }
}