package ba.unsa.etf.rpr;

import java.util.*;

public class Imenik {

    private Map<String, TelefonskiBroj> brojevi;

    public Imenik() {
        this.brojevi = new HashMap<String, TelefonskiBroj>();
    }

    public Map<String, TelefonskiBroj> getBrojevi() {
        return brojevi;
    }

    public void setBrojevi(Map<String, TelefonskiBroj> brojevi) {
        this.brojevi = brojevi;
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        brojevi.put(ime, broj);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj broj = brojevi.get(ime);
        if (broj != null) return broj.ispisi();
        return null;
    }

    public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> entry : brojevi.entrySet()) {
            if (entry.getValue().ispisi().equals(broj.ispisi()))
                return entry.getKey();
        }
        return null;
    }

    public String naSlovo(char c) {
        StringBuilder builder = new StringBuilder();

        int counter = 1;
        for (Map.Entry<String, TelefonskiBroj> entry : brojevi.entrySet()) {
            if (entry.getKey().startsWith(String.valueOf(c))) {
                builder.append(counter)
                .append(". ")
                .append(entry.getKey())
                .append(" - ")
                .append(entry.getValue().ispisi())
                .append(System.lineSeparator());
            }
            counter++;
        }
        return builder.toString();
    }

    public Set<String> izGrada(Grad g) {
        Set<String> results = new TreeSet<String>();
        // TreeSet automatski sortira elemente prilikom dodavanja novih elemenata
        for (Map.Entry<String, TelefonskiBroj> entry : brojevi.entrySet()) {
            if (jeLiIzGrada(entry.getValue(), g))
                results.add(entry.getKey());
        }
        return results;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> results = new TreeSet<TelefonskiBroj>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj b1, TelefonskiBroj b2) {
                return b1.ispisi().compareTo(b2.ispisi());
            }
        });

        for (Map.Entry<String, TelefonskiBroj> entry : brojevi.entrySet()) {
            if (jeLiIzGrada(entry.getValue(), g))
                results.add(entry.getValue());
        }
        return results;
    }

    private boolean jeLiIzGrada(TelefonskiBroj broj, Grad g) {
        return broj instanceof FiksniBroj && g.equals(((FiksniBroj) broj).getGrad());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int counter = 1;
        for (Map.Entry<String, TelefonskiBroj> entry : brojevi.entrySet()) {
            builder.append(counter)
                    .append(". ")
                    .append(entry.getKey())
                    .append(" - ")
                    .append(entry.getValue().ispisi())
                    .append(System.lineSeparator());
            counter++;
        }
        return builder.toString();
    }

}
