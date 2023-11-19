package ba.unsa.etf.rpr;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        ArrayList<String> listaImena = new ArrayList<>();
        Kolekcija imena;
        for(;;) {
            System.out.println("Unesite 'Ime Prezime': (za kraj unosa unesite 'STOP')");
            String ime = ulaz.nextLine();
            if (ime.equals("STOP")) {
                System.out.println("Prekidam unos...");
                break;
            }
            listaImena.add(ime);
        }
        imena = new KolekcijaImena(listaImena);
        if (imena instanceof KolekcijaImena)
            System.out.print("Najduze ime i prezime koje ste unijeli je: " + ((KolekcijaImena)imena).getNajduzeIme());
        else System.out.println("Kolekcija imena nije instanca klase KolekcijaImena");
        try {
            Pobjednik p = new Pobjednik(imena);
        }
        catch(Exception e) {
            System.out.println("IZUZETAK: " + e.getMessage());
        }
    }
}