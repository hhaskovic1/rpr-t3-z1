package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj {


    TelefonskiBroj() {}

    TelefonskiBroj(int Comparable<TelefonskiBroj>)
    {
        int compareTo(TelefonskiBroj b) {
            return(this.ispisi()compareTo(b.ispisi()));
        }
    }

    public abstract String ispisi();
    public abstract int hashCode();
}
