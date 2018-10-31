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
        Set set = listaBrojeva.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            Map.Entry par = (Map.Entry)it.next();
            if(par.getValue()==broj)return (String) par.getKey();
        }
        return null;
    }

    String naSlovo(char s) {

        String lista="";
        int i=1;
        for (Map.Entry<String, TelefonskiBroj> entry : listaBrojeva.entrySet()) {
            String rijec=entry.getKey();
            char oznaka=rijec.charAt(0);
            if(oznaka==s){
                lista+=i + ". " + entry.getKey() + " - " + listaBrojeva.get(entry.getKey()).ispisi() + "\n";
                i++;
            }

        }
        return lista;
    }

    Set<String> izGrada(FiksniBroj.Grad g) {
        return null;
    }

    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        return null;
    }




}
