package primer05;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<poredjenja.Oblik> oblici = new LinkedList<>();

        oblici.add(new Krug(new Tacka(), 5));
        oblici.add(new Krug(new Tacka(2, 4), 10));
        oblici.add(new Pravougaonik(new Tacka(), 10, 4));
        oblici.add(new Pravougaonik(new Tacka(), 100, 1));
        oblici.add(new Krug(new Tacka(), 6));
        oblici.add(new Pravougaonik(new Tacka(), 10, 6));
        oblici.add(new Krug(new Tacka(), 7));
        oblici.add(new Pravougaonik(new Tacka(), 10, 2));

        System.out.println(oblici);
        oblici.sort(Oblik.komparator);
        System.out.println(oblici);
    }
}
