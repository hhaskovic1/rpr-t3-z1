package ba.unsa.etf.rpr.tutorijal03;

import org.junit.jupiter.api.Test;

public class FiksniBrojTest {

    public enum Grad {
        TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKIBRIJEG, BRCKO;
    }

    @Test
    public void konstruktorTest(Grad grad, String broj) {

        FiksniBroj fiksni =new FiksniBroj("",033/456-789);
        assertEquals("033/456-789", fiksni.ispisi());

    }

}
