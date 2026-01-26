package zadatak02_03;

public class Elipsa extends Oblik {
    private double a;
    private double b;

    public Elipsa(double a, double b) {
        // super();
        inic(a, b);
    }

    public Elipsa(Tacka centar, double a, double b) {
        super(centar);
        inic(a, b);
    }

    public Elipsa(Elipsa e) {
        super(e.centar);
        inic(e.a, e.b);
    }

    public double getA() {
        return a;
    }

    private void inic(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Elipsa sa poluosama " + a + ", " + b + " i centrom " + centar;
    }
}
