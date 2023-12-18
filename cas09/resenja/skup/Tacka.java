package skup;

import java.util.Objects;

public class Tacka {
    private double x;
    private double y;

    public Tacka() {
        this(0, 0);
    }

    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tacka tacka)) return false;
        return Double.compare(x, tacka.x) == 0 && Double.compare(y, tacka.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
