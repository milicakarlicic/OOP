package primer02;

public class Razlika extends BinarniIzraz {
    public Razlika(Izraz levi, Izraz desni) {
        super(levi, desni);
    }

    @Override
    public double izracunaj() {
        return getLevi().izracunaj() - getDesni().izracunaj();
    }

    @Override
    public Izraz klon() {
        return new Razlika(getLevi(), getDesni());
    }

    @Override
    public String toString() {
        // (4) + (5)
        return "(" + getLevi() + ")" + " - " + "(" + getDesni() + ")";
    }
}
