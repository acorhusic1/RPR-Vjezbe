package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InformacijeOStudentu s = new InformacijeOStudentu();
        s.setIme("Paja");
        s.setPrezime("Patak");
        s.setBrojIndexa("123");
        System.out.println(s.getIme());

        InformacijeONastavniku n = new InformacijeONastavniku();
        n.setIme("Miki");
        n.setPrezime("Maus");
        n.setTitula("red.prof.dr");

        try {

            Scanner ulaz = new Scanner(System.in);
            System.out.println("Unesite ocjene za " + n.predstavi() + ", za prekid unosa unesite 'STOP': ");
            ArrayList<Ocjena> ocjene = new ArrayList<>();
            for (; ; ) {
                String unos = ulaz.nextLine();
                if (unos.equals("STOP")) break;
                ocjene.add(new Ocjena(n, Integer.parseInt(unos)));
            }
            n.setOcjene(ocjene);

            System.out.print("Ocjene za nastavnika " + n.predstavi() + " su:");
            for (Ocjena o : n.getOcjene())
                System.out.print(" " + o.getOcjena());
        }
        catch(IllegalArgumentException e) {
            System.out.println("IZUZETAK: " + e.getMessage());
        }
    }
}