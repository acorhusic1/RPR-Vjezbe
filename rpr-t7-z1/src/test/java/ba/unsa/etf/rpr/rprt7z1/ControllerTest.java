package ba.unsa.etf.rpr.rprt7z1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(ApplicationExtension.class)

class ControllerTest {
    @Start
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("forma.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 430, 240);
        stage.setTitle("Korisnici");
        stage.setScene(scene);
        stage.show();
        stage.toFront();
    }

    @Test
    public void test1(FxRobot robot) {
        Button btnKraj = robot.lookup("#btnKraj").queryAs(Button.class);
        assertNotNull(btnKraj);
        robot.press(KeyCode.CONTROL).press(KeyCode.A).release(KeyCode.A).release(KeyCode.CONTROL);
        robot.write("test123");
        robot.clickOn("#fldIme");
        assertEquals("test123", robot.lookup("#fldIme").queryButton().getText());
    }
}