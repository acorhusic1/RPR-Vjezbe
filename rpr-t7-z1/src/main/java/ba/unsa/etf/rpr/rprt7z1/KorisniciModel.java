package ba.unsa.etf.rpr.rprt7z1;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici;
    private SimpleObjectProperty<Korisnik> trenutniKorisnik;

    public KorisniciModel() {
        korisnici = FXCollections.observableArrayList();
        trenutniKorisnik = new SimpleObjectProperty<>(new Korisnik());
    }

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.setValue(trenutniKorisnik);
    }

    public void napuni() {
        korisnici.add(new Korisnik("Paja","Patak","ppatak1@etf.unsa.ba","ppatak1","patak123"));
        korisnici.add(new Korisnik("Miki","Maus","mikimaus@gmail.com","mmaus","abcabc"));
        korisnici.add(new Korisnik("Dzemil","ThePainter","dzTheP@gmail.com","dzthepainter","spaghetticode"));
        trenutniKorisnik.set(korisnici.get(1));
    }

    public void add(Korisnik k) {
        korisnici.add(k);
        trenutniKorisnik.set(korisnici.get(korisnici.size() - 1));
    }

    public void find(Korisnik k) {
        int i = 0;
        for (; i < korisnici.size(); i++)
            if (korisnici.get(i).equals(k))
                break;
        trenutniKorisnik.set(korisnici.get(i));
    }
}
