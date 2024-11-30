package kutija;

public class Tacka {
    private double x;
    private double y;

    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
