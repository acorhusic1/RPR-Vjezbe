package ba.unsa.etf.rpr.rprt6z1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
        @Override
        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("digitron.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),200, 240);
            stage.setTitle("Digitron");
            stage.setScene(scene);
            stage.show();
        }
        public static void main(String[] args) {
            launch();
        }
}