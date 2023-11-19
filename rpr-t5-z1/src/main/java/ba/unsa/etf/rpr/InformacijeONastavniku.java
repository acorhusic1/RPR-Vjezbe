package ba.unsa.etf.rpr;

public class InformacijeONastavniku extends LicneInformacije implements InterfejsPredstavi {
    private String titula;

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    @Override
    public String predstavi() {
        return getTitula() + " " + getIme() + " " + getPrezime();
    }
}
