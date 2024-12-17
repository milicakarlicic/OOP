package primer05;

public class Krug extends Oblik {
    private double poluprecnik;

    public Krug(Tacka centar, double poluprecnik) {
        super(centar);
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    @Override
    public String toString() {
        return "K{" +
                "r=" + poluprecnik +
                '}';
    }
}
