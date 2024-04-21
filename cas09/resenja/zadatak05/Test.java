package zadatak05;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<Tacka> skup = new HashSet<>();

        skup.add(new Tacka(0, 1));
        skup.add(new Tacka());
        skup.add(new Tacka(1, 5));
        skup.add(new Tacka(-1, 6));
        skup.add(new Tacka(4, -2));
        System.out.println(skup);

    }
}
