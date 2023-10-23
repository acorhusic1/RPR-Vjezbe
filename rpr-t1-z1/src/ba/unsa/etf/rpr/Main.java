package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a, b;
	    Scanner ulaz = new Scanner(System.in);
	    System.out.println("Unesite brojeve a i b: ");
	    a = ulaz.nextInt();
	    b = ulaz.nextInt();
	    System.out.println("a = " + a + ", b = " + b);
    }
}
