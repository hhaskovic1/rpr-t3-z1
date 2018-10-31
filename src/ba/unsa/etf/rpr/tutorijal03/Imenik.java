package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;
import java.util.HashMap;

public class Imenik {

    private HashMap<String, TelefonskiBroj> listaBrojeva = new HashMap<String, TelefonskiBroj>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        listaBrojeva.put(ime, broj);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj broj = listaBrojeva.get(ime);
        return broj.ispisi();

    }

    public String dajIme(TelefonskiBroj broj) {

    }

    String naSlovo(char s) {

    }

    Set<String> izGrada(FiksniBroj.Grad g) {

    }

    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        return null;
    }




}
