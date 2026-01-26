package primer01;

import java.util.Comparator;

public class PorediPrvoPoX implements Comparator<Tacka> {
    @Override
    public int compare(Tacka o1, Tacka o2) {
        return o1.getX() == o2.getX() ?
                Double.compare(o1.getY(), o2.getY()) : Double.compare(o1.getX(), o2.getX());
    }
}
