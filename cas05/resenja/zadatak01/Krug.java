package zadatak01;

public class Krug extends Elipsa {
    public Krug(double r) {
        super(r, r);
    }

    public Krug(Tacka centar, double r) {
        super(centar, r, r);
    }

    public Krug(Krug k) {
        this(k.centar, k.getPoluprecnik());
    }

    public double getPoluprecnik() {
        return getA();
    }

    @Override
    public double obim() {
        return 2 * getPoluprecnik() * Math.PI;
    }

    @Override
    public String toString() {
        return "Krug sa poluprecnikom " + getPoluprecnik() + " i centrom " + centar;
    }
}
