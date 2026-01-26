package zadatak03;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        List<Tacka> tacke = new LinkedList<>();
        tacke.add(new Tacka(1, 2));
        tacke.add(new Tacka(1, -3));
        tacke.add(new Tacka(1, -4));
        tacke.add(new Tacka(-1, -4));
        tacke.add(new Tacka(6, 10));
        tacke.add(new Tacka(-3, 1));
        tacke.add(new Tacka(0, 1));

        MaxFinder<Tacka> pronalazac1 = new MaxFinder<>();
        Optional<Tacka> max = pronalazac1.findMax(tacke,
                (e1, e2) -> e1.getX() != e2.getX() ?
                    Double.compare(e1.getX(), e2.getX()) :
                    Double.compare(e1.getY(), e2.getY()));
        if (max.isPresent()) {
            System.out.println(max.get());
        }

        MaxFinder<Tacka> pronalazac2 = new MaxFinder<>();
        max = pronalazac2.findMax(tacke);
        if (max.isPresent()) {
            System.out.println(max.get());
        }
    }
}
