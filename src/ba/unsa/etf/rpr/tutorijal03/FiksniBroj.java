package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj{

    public enum Grad {
        TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKIBRIJEG, BRCKO;
    }

    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad=grad;
        this.broj=broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String ispisi() {
        return null;
    }
}
