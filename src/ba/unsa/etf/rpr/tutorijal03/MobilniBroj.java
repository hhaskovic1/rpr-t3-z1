package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{

    private int mobilnaMreza;
    private String broj;

    MobilniBroj() {}

    MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }

    boolean compare(MobilniBroj m1) {
        MobilniBroj m2 = new MobilniBroj();

        if(m1.mobilnaMreza==m2.mobilnaMreza)return true;
        else return false;

    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }


}
