package primer05;

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

    public Tacka(Tacka t) {
        this(t.x, t.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
