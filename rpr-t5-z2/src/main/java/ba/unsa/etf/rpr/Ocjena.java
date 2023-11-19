package ba.unsa.etf.rpr;

public class Ocjena {
    private LicneInformacije osoba;
    private int ocjena;
    public Ocjena(LicneInformacije osoba, int ocjena) {
        setOcjena(ocjena);
        this.osoba = osoba;
    }

    public int getOcjena() { return ocjena; }
    public void setOcjena(int ocjena) {
        if (ocjena < 1 || ocjena > 10) throw new IllegalArgumentException("Nevalidna ocjena");
        this.ocjena = ocjena;
    }
}
