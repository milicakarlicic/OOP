package zadatak02;

public class Konstanta extends Izraz {
    private double vrednost;

    public Konstanta(double vrednost) {
        this.vrednost = vrednost;
    }

    @Override
    public double izracunaj() {
        return vrednost;
    }

    public Konstanta(Konstanta k) {
        vrednost = k.vrednost;
    }

    @Override
    public Izraz klon() {
        return new Konstanta(this);
    }

    @Override
    public String toString() {
        return vrednost + "";
    }
}
