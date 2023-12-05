package ba.unsa.etf.rpr.rprt6z1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static java.lang.Math.*;

public class Controller {
    private StringBuilder a = new StringBuilder(""), b = new StringBuilder("");
    private String operator = new String("");
    private boolean drugi = false; // false je A, a true je B

    private String calculate() {
        Double a = Double.parseDouble(this.a.toString());
        Double b = Double.parseDouble(this.b.toString());
        Double rez = null;
        switch(this.operator) {
            case "+":
                rez = a + b;
                break;
            case "-":
                rez = a - b;
                break;
            case "*":
                rez = a * b;
                break;
            case "/":
                // dijeljenje nulom, sta je najbolje uraditi?
                if (b.compareTo(.0) == 0) return "DN";
                break;
            case "%":
                rez = a % b;
                break;
            default:
                // invalidni operator!
                return "IO";
        }
        return rez.toString();
    }

    @FXML
    private Label display;

    @FXML
    protected void plusBtn() {
        if (drugi) {
            a = new StringBuilder("");
            b = new StringBuilder("");
            drugi = false;
        }
        else {
            display.setText(display.getText() + " + ");
            operator = "+";
            drugi = true;
        }
    }
    @FXML
    protected void onMinusButtonClick() {
        if (drugi) {
            a = new StringBuilder("");
            b = new StringBuilder("");
            drugi = false;
        }
        else {
            display.setText(display.getText() + " - ");
            operator = "-";
            drugi = true;
        }
    }
    @FXML
    protected void onMulButtonClick( ) {
        if (drugi) {
            a = new StringBuilder("");
            b = new StringBuilder("");
            drugi = false;
        }
        else {
            display.setText(display.getText() + " * ");
            operator = "*";
            drugi = true;
        }
    }
    @FXML
    protected void onDivButtonClick() {
        if (drugi) {
            a = new StringBuilder("");
            b = new StringBuilder("");
            drugi = false;
        }
        else {
            display.setText(display.getText() + " / ");
            operator = "/";
            drugi = true;
        }
    }
    @FXML
    protected void onPctButtonClick() {
        if (drugi) {
            a = new StringBuilder("");
            b = new StringBuilder("");
            drugi = false;
        }
        else {
            display.setText(display.getText() + " % ");
            operator = "%";
            drugi = true;
        }
    }
    @FXML
    protected void btn0() {
        display.setText(display.getText() + "0");
        if (drugi)
            b.append("0");
        else
            a.append("0");
    }
    @FXML
    protected void btn1() {
        display.setText(display.getText() + "1");
        if (drugi)
            b.append("1");
        else
            a.append("1");
    }
    @FXML
    protected void btn2() {
        display.setText(display.getText() + "2");
        if (drugi)
            b.append("2");
        else
            a.append("2");
    }
    @FXML
    protected void btn3() {
        display.setText(display.getText() + "3");
        if (drugi)
            b.append("3");
        else
            a.append("3");
    }
    @FXML
    protected void btn4() {
        display.setText(display.getText() + "4");
        if (drugi)
            b.append("4");
        else
            a.append("4");
    }
    @FXML
    protected void btn5() {
        display.setText(display.getText() + "5");
        if (drugi)
            b.append("5");
        else
            a.append("5");
    }
    @FXML
    protected void btn6() {
        display.setText(display.getText() + "6");
        if (drugi)
            b.append("6");
        else
            a.append("6");
    }
    @FXML
    protected void btn7() {
        display.setText(display.getText() + "7");
        if (drugi)
            b.append("7");
        else
            a.append("7");
    }
    @FXML
    protected void btn8() {
        display.setText(display.getText() + "8");
        if (drugi)
            b.append("8");
        else
            a.append("8");
    }
    @FXML
    protected void btn9() {
        display.setText(display.getText() + "9");
        if (drugi)
            b.append("9");
        else
            a.append("9");
    }
    @FXML
    protected void onEqualsButtonClick() {
        String rez = calculate();
        if (rez.equals("DN")) display.setText("DivByZero");
        else if (rez.equals("IO")) display.setText("InvOperator");
        else display.setText(rez);
        a = new StringBuilder(rez);
        b = new StringBuilder("");
        drugi = false;
    }
    @FXML
    protected void dotBtn() {
        display.setText(display.getText() + ".");
        if(drugi)
            b.append(".");
        else
            a.append(".");
    }
}