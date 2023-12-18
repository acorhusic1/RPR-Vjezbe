package ba.unsa.etf.rpr.rprt7z1;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici = FXCollections.observableArrayList();
    private final SimpleObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<Korisnik>(new Korisnik("", "", "", "", ""));

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return (Korisnik)trenutniKorisnik.get();
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
        korisnici.add((Korisnik)trenutniKorisnik.getBean());
        trenutniKorisnik.setValue(new Korisnik());
    }
}
