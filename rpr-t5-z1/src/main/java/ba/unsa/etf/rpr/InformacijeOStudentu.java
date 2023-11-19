package ba.unsa.etf.rpr;

public class InformacijeOStudentu extends LicneInformacije implements InterfejsPredstavi {
    private String godinaStudija, brojIndexa;

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    @Override
    public String predstavi() {
        return "Ime: " + getIme() + ", prezime: " + getPrezime() + ", godina studija: " + getGodinaStudija() + ", broj indeksa: " + getBrojIndexa();
    }
}
