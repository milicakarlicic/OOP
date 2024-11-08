package primer02;

public class Proizvod extends BinarniIzraz {
    public Proizvod(Izraz levi, Izraz desni) {
        super(levi, desni);
    }

    @Override
    public double izracunaj() {
        return getLevi().izracunaj() * getDesni().izracunaj();
    }

    @Override
    public Izraz klon() {
        return new Proizvod(getLevi(), getDesni());
    }

    @Override
    public String toString() {
        return "(" + getLevi() + ")" + " * " + "(" + getDesni() + ")";
    }
}
