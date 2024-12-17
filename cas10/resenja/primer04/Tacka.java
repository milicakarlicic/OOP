package primer04;

import java.util.Comparator;

public class Tacka {
    private double x;
    private double y;

    // ako lambda izraz tj. anonimna funkciju ima samo jednu return naredbu
    // nije neophodno pisati {} zagrade (izraz nakon -> se tumaci kao vrednost koja se vraca)
    // u ostalim slucajevima sintaksa je: (argumenti) -> {telo}
    public static Comparator<Tacka> porediPrvoPoX = (o1, o2) -> o1.x== o2.x ?
            Double.compare(o1.y, o2.y) : Double.compare(o1.x, o2.x);

    public static Comparator<Tacka> porediPrvoPoY = (o1, o2) -> o1.y == o2.y ?
            Double.compare(o1.x, o2.x) : Double.compare(o1.y, o2.y);

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
