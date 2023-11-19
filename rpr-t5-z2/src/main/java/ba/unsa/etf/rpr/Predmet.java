package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Predmet implements InterfejsPredstavi {
    private String naziv, opis;
    private ArrayList<Ocjena> ocjene;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public ArrayList<Ocjena> getOcjene() { return ocjene; }

    public void setOcjene(ArrayList<Ocjena> ocjene) {
        this.ocjene = ocjene;
    }

    @Override
    public String predstavi() {
        return "Naziv: " + naziv + " opis: " + opis;
    }
}
