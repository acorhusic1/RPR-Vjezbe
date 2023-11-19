package ba.unsa.etf.rpr;

public class Pobjednik {
    private String ime, prezime;
    private int brojZnakova;
    private Kolekcija kolekcija;

    public Pobjednik(Kolekcija kolekcija) throws Exception {
        KolekcijaImena nova;
        if (kolekcija instanceof KolekcijaImena) {
            nova = (KolekcijaImena) kolekcija;
        }
        else throw new Exception("Kolekcija nije objekat klase KolekcijaImena");
        String osoba = nova.getNajduzeIme();
        this.ime = osoba.substring(0, osoba.indexOf(" "));
        this.brojZnakova = ime.length();
        this.prezime = osoba.substring(osoba.indexOf(" ") + 1, osoba.length());
    }
}
