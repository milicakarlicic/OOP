package primer02;

public class Promenljiva extends Izraz {
    private String ime;
    private double vrednost;

    public Promenljiva(String ime, double vrednost) {
        this.ime = ime;
        this.vrednost = vrednost;
    }

    @Override
    public double izracunaj() {
        return vrednost;
    }

    @Override
    public Izraz klon() {
        return new Promenljiva(ime, vrednost);
    }

    @Override
    public String toString() {
        return ime;
    }
}
