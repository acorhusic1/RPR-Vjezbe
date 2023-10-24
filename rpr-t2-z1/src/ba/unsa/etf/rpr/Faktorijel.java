package ba.unsa.etf.rpr;

public class Faktorijel {
    public static int fakt(int n) {
        if (n == 0) return 1;
        return n * fakt(n - 1);
    }
}
