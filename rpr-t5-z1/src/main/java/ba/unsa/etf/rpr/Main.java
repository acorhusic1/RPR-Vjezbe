package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        InformacijeOStudentu s = new InformacijeOStudentu();
        s.setIme("Paja");
        s.setPrezime("Patak");
        s.setBrojIndexa("123");
        System.out.println(s.getIme());
        InformacijeONastavniku n = new InformacijeONastavniku();
        n.setIme("Miki");
        n.setPrezime("Maus");
        n.setTitula("red.prof.dr");
    }
}