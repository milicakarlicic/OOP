package zadatak02;

public class Zbir extends BinarniIzraz {
    public Zbir(Izraz levi, Izraz desni) {
        super(levi, desni);
    }

    @Override
    public double izracunaj() {
        return getLevi().izracunaj() + getDesni().izracunaj();
    }

    @Override
    public Izraz klon() {
        return new Zbir(getLevi(), getDesni());
    }

    @Override
    public String toString() {
        return "(" + getLevi() + ")" + " + " + "(" + getDesni() + ")";
    }
}
