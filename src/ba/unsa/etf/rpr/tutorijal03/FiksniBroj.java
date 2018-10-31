package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj {

    public enum Grad {
        TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKIBRIJEG, BRCKO;
    }

    private Grad grad;
    private String tel;

    public FiksniBroj(Grad grad, String tel) {
        this.grad=grad;
        this.tel=tel;
    }



}
