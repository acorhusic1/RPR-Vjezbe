package ba.unsa.etf.rpr.z3;

import ba.unsa.etf.rpr.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void testMockExternal() {
        Imenik i = Mockito.mock(Imenik.class);
        Mockito.when(i.dajBroj("Miki")).thenReturn("Nema nista");
        String test = i.dajBroj("Miki");
        assertEquals(test, "Nema nista");
    }
    @Test
    public void testMockInternal() {
        Map<String, TelefonskiBroj> mapa = Mockito.mock(Map.class);
        Mockito.when(mapa.get("Miki")).thenReturn(new FiksniBroj(Grad.MOSTAR, "747-777"));
        imenik.setBrojevi(mapa);

        String broj = imenik.dajBroj("Miki");
        assertNotEquals(broj, "051/747-777");
        assertEquals(broj, "036/747-777");
    }

}
