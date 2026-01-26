package primer01;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Tacka> tacke = new LinkedList<>();

        tacke.add(new Tacka());
        tacke.add(new Tacka(0, -4));
        tacke.add(new Tacka(-2, 4));
        tacke.add(new Tacka(-3, 4));
        tacke.add(new Tacka(0, 6));
        tacke.add(new Tacka(-2, 6));
        System.out.print("pocetna lista tacaka: ");
        System.out.println(tacke);

        System.out.print("sortirano prvo po x: ");
        tacke.sort(new PorediPrvoPoX());
        System.out.println(tacke);

        System.out.print("sortirano prvo po y: ");
        tacke.sort(new PorediPrvoPoY());
        System.out.println(tacke);
    }

}
