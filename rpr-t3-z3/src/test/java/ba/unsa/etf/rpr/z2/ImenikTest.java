package ba.unsa.etf.rpr.z2;

import ba.unsa.etf.rpr.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

public class ImenikTest {

    private static Imenik imenik = new Imenik();

    @BeforeAll
    public static void setup() {
        imenik.dodaj("Paja", new FiksniBroj(Grad.BANJA_LUKA, "747-777"));
        imenik.dodaj("Patak", new MedunarodniBroj("+47", "6376283273"));
        imenik.dodaj("Miki", new MobilniBroj(61, "156-950"));
        imenik.dodaj("Maus", new FiksniBroj(Grad.DOBOJ, "111-333"));
    }

    @Test
    public void dajBrojFound() {
        String broj = imenik.dajBroj("Patak");
        assertEquals(broj, "6376283273");
    }
    @Test
    public void dajBrojNotFound() {
        String broj = imenik.dajBroj("PinkPanther");
        assertNull(broj);
    }
    @Test
    public void dodajTestPositive() {
        TelefonskiBroj broj = new MobilniBroj(61, "555-555");
        imenik.dodaj("BeepBeep", broj);
        String brojString = imenik.dajBroj("BeepBeep");
        assertEquals(brojString, "061/555-555");
    }
    @Test
    public void dodajFiksniException() {
        assertThrows(BrojException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new FiksniBroj(null, "123-123");
            }
        });

        assertThrows(BrojException.class, () -> { new FiksniBroj(null, "123-123"); });
    }

}
