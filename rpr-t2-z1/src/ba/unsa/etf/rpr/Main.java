package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        for (String x : args) {
            int a = Integer.parseInt(x);
            System.out.println("a = " + a + " Faktorijel: " + Faktorijel.fakt(a) + " Sinus: " + Sinus.sin(a));
        }
    }
}
