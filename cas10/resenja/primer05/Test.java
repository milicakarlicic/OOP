package primer05;

import poredjenja.Krug;
import poredjenja.Oblik;
import poredjenja.Pravougaonik;
import poredjenja.Tacka;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<poredjenja.Oblik> oblici = new LinkedList<>();

        oblici.add(new poredjenja.Krug(new poredjenja.Tacka(), 5));
        oblici.add(new poredjenja.Krug(new poredjenja.Tacka(2, 4), 10));
        oblici.add(new poredjenja.Pravougaonik(new poredjenja.Tacka(), 10, 4));
        oblici.add(new poredjenja.Pravougaonik(new poredjenja.Tacka(), 100, 1));
        oblici.add(new poredjenja.Krug(new poredjenja.Tacka(), 6));
        oblici.add(new poredjenja.Pravougaonik(new poredjenja.Tacka(), 10, 6));
        oblici.add(new Krug(new poredjenja.Tacka(), 7));
        oblici.add(new Pravougaonik(new Tacka(), 10, 2));

        System.out.println(oblici);
        oblici.sort(Oblik.komparator);
        System.out.println(oblici);
    }
}
