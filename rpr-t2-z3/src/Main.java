import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Double min(ArrayList<Double> lista) {
        Double min = lista.get(0);
        for (Double x : lista)
            if (x < min)
                min = x;
        return min;
    }

    public static Double max(ArrayList<Double> lista) {
        Double max = lista.get(0);
        for (Double x : lista)
            if (x > max)
                max = x;
        return max;
    }

    public static Double mean(ArrayList<Double> lista) {
        Double suma = 0.0;
        for (Double x : lista)
            suma = suma + x;
        return suma / lista.size();
    }

    public static Double standardnaDevijacija(ArrayList<Double> lista) {
        Double varijansa = 0.0;
        Double mean = mean(lista);
        for (Double x : lista) {
            varijansa = varijansa + Math.pow(x - mean, 2);
        }
        return Math.sqrt(varijansa / lista.size());
    }

    public static void main(String[] args) {
        String unos;
        // ovdje ne moze primitivni double, vec mora njegov omotac Double
        ArrayList<Double> lista = new ArrayList<Double>();
        Scanner ulaz = new Scanner(System.in);

        for (int i = 0; ; i++) {
            System.out.println("Unesite sljedeci broj ili unesite 'stop' za prestanak unosa: ");
            unos = ulaz.nextLine();
            if (isNumeric(unos)) {
                lista.add(i, Double.parseDouble(unos));
            } else if (unos.equals("stop")) {
                    System.out.println("Prekidam unos...");
                    break;
            } else {
                i--; // slucaj kada je unos neko "smece"
            }
        }

        System.out.println("Max element je: " + max(lista));
        System.out.println("Min element je: " + min(lista));
        System.out.println("Mean je: " + mean(lista));
        System.out.println("Standardna devijacija je: " + standardnaDevijacija(lista));
    }
}