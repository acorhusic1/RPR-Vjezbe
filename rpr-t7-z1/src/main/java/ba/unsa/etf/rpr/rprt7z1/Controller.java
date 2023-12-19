package ba.unsa.etf.rpr.rprt7z1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private KorisniciModel model = new KorisniciModel();
    @FXML
    private ListView<Korisnik> fldLista = new ListView<>();
    @FXML
    private TextField fldIme, fldPrezime, fldEmail, fldKorisnickoIme;
    @FXML
    private PasswordField fldLozinka;

    @FXML
    public void initialize() {
        fldIme.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
        fldLista.setItems(model.getKorisnici());

        fldLista.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> model.setTrenutniKorisnik(newSelection)
        );

        model.trenutniKorisnikProperty().addListener(
                (obs, prev, next) -> {
                    if (prev != null) {
                        fldIme.textProperty().unbindBidirectional(prev.imeProperty());
                        fldPrezime.textProperty().unbindBidirectional(prev.prezimeProperty());
                        fldEmail.textProperty().unbindBidirectional(prev.emailProperty());
                        fldLozinka.textProperty().unbindBidirectional(prev.lozinkaProperty());
                        fldKorisnickoIme.textProperty().unbindBidirectional(prev.korisnickoImeProperty());
                    }
                    if (next != null) {
                        fldIme.textProperty().bindBidirectional(next.imeProperty());
                        fldPrezime.textProperty().bindBidirectional(next.prezimeProperty());
                        fldEmail.textProperty().bindBidirectional(next.emailProperty());
                        fldLozinka.textProperty().bindBidirectional(next.lozinkaProperty());
                        fldKorisnickoIme.textProperty().bindBidirectional(next.korisnickoImeProperty());
                    } else {
                        fldIme.setText("");
                        fldPrezime.setText("");
                        fldEmail.setText("");
                        fldLozinka.setText("");
                        fldKorisnickoIme.setText("");
                    }
                    fldLista.refresh();
                }
        );

        fldLista.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldKorisnik, newKorisnik) -> {
                    model.setTrenutniKorisnik(newKorisnik);
                    fldLista.refresh();
                });

        model.napuni();
    }

    @FXML
    public void btnDodaj(ActionEvent actionEvent) {
        if (fldIme.getText().trim().isEmpty() || fldPrezime.getText().trim().isEmpty() || fldEmail.getText().trim().isEmpty() || fldKorisnickoIme.getText().trim().isEmpty() || fldLozinka.getText().trim().isEmpty()) {
            System.out.println("Niste popunili sva polja forme!");
            return;
        }

        fldLista.getSelectionModel().select(model.getTrenutniKorisnik());
        model.add(new Korisnik());
        fldLista.refresh();
        fldLista.getSelectionModel().select(model.getTrenutniKorisnik());
    }

    @FXML
    public void btnKraj(ActionEvent actionEvent) {
        System.exit(0);
    }

}