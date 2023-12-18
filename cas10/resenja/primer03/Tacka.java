package primer03;

import java.util.Comparator;

public class Tacka {
    private double x;
    private double y;

    public static Comparator<Tacka> porediPrvoPoX = new Comparator<Tacka>() {
        @Override
        public int compare(Tacka o1, Tacka o2) {
            return o1.x== o2.x ?
                    Double.compare(o1.y, o2.y) : Double.compare(o1.x, o2.x);
        }
    };

    public static Comparator<Tacka> porediPrvoPoY = new Comparator<Tacka>() {
        @Override
        public int compare(Tacka o1, Tacka o2) {
            return o1.y == o2.y ?
                    Double.compare(o1.x, o2.x) : Double.compare(o1.y, o2.y);
        }
    };

    public Tacka() {
        this(0, 0);
    }

    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
