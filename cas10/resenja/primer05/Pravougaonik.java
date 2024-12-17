package primer05;

public class Pravougaonik extends Oblik {
    private double a;
    private double b;

    public Pravougaonik(Tacka centar, double a, double b) {
        super(centar);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return "P{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
