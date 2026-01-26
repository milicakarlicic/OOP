package zadatak02_03;

public class Krug extends Elipsa {
    public Krug(double r) {
        super(r, r);
    }

    public Krug(Tacka centar, double r) {
        super(centar, r, r);
    }

    public Krug(Krug k) {
        super(k.centar, k.getPoluprecnik(), k.getPoluprecnik());
    }

    public double getPoluprecnik() {
        return getA();
    }

    @Override
    public String toString() {
        return "Krug sa poluprecnikom " + getPoluprecnik() + " i centrom " + centar;
    }
}
