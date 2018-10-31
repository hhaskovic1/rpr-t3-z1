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
        int pozivniBroj=0;
        if(this.grad==Grad.SARAJEVO)return pozivniBroj=33;
        if(this.grad==Grad.TRAVNIK)return pozivniBroj=34;
        if(this.grad==Grad.ORASJE)return pozivniBroj=35;
        if(this.grad==Grad.ZENICA)return pozivniBroj=36;
        if(this.grad==Grad.LIVNO)return pozivniBroj=37;
        if(this.grad==Grad.TUZLA)return pozivniBroj=38;
        if(this.grad==Grad.MOSTAR)return pozivniBroj=40;
        if(this.grad==Grad.BIHAC)return pozivniBroj=41;
        if(this.grad==Grad.GORAZDE)return pozivniBroj=42;
        if(this.grad==Grad.SIROKIBRIJEG)return pozivniBroj=45;
        if(this.grad==Grad.BRCKO)return pozivniBroj=50;
        else return(1);
    }

    @Override
    public String ispisi() {

        int pozivniBroj=0;
        if(this.grad==Grad.SARAJEVO)pozivniBroj=33;
        if(this.grad==Grad.TRAVNIK)pozivniBroj=34;
        if(this.grad==Grad.ORASJE)pozivniBroj=35;
        if(this.grad==Grad.ZENICA)pozivniBroj=36;
        if(this.grad==Grad.LIVNO)pozivniBroj=37;
        if(this.grad==Grad.TUZLA)pozivniBroj=38;
        if(this.grad==Grad.MOSTAR)pozivniBroj=40;
        if(this.grad==Grad.BIHAC)pozivniBroj=41;
        if(this.grad==Grad.GORAZDE)pozivniBroj=42;
        if(this.grad==Grad.SIROKIBRIJEG)pozivniBroj=45;
        if(this.grad==Grad.BRCKO)pozivniBroj=50;

        return "0" + pozivniBroj + "/" + broj;
    }
}
