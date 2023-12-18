package ba.unsa.etf.rpr.rprt7z1;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class Controller {
    KorisniciModel model = new KorisniciModel();
    @FXML
    private ListView<Korisnik> fldLista = new ListView<>();
    @FXML
    private TextField fldIme, fldPrezime, fldEmail, fldKorisnickoIme, fldLozinka;

    @FXML
    public void initialize() {
        fldLista.setItems(model.getKorisnici());

        fldIme.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
        fldPrezime.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
        fldEmail.textProperty().bindBidirectional(model.getTrenutniKorisnik().emailProperty());
        fldKorisnickoIme.textProperty().bindBidirectional(model.getTrenutniKorisnik().korisnickoImeProperty());
        fldLozinka.textProperty().bindBidirectional(model.getTrenutniKorisnik().lozinkaProperty());

        fldLista.getSelectionModel().selectedItemProperty().addListener((obs, stari, novi) -> {
            model.setTrenutniKorisnik(novi);
            fldLista.refresh();
        });
    }

    @FXML
    public void btnDodaj(ActionEvent actionEvent) {
        if (fldIme.getText().trim().isEmpty() || fldPrezime.getText().trim().isEmpty() || fldEmail.getText().trim().isEmpty() || fldKorisnickoIme.getText().trim().isEmpty() || fldLozinka.getText().trim().isEmpty()) {
            System.out.println("Niste popunili sva polja forme!");
            return;
        }
        System.out.println(model.getTrenutniKorisnik().getIme() + " + " + model.getTrenutniKorisnik().getPrezime());

    //    Korisnik noviKorisnik = new Korisnik(fldIme.getText(), fldPrezime.getText(), fldEmail.getText(), fldKorisnickoIme.getText(), fldLozinka.getText());
        fldLista.getSelectionModel().select(model.getTrenutniKorisnik());
        model.napuni();
        /*
        fldIme.clear();
        fldPrezime.clear();
        fldEmail.clear();
        fldKorisnickoIme.clear();
        fldLozinka.clear();
        */
    }

    @FXML
    public void btnKraj(ActionEvent actionEvent) {
        System.exit(0);
    }
}