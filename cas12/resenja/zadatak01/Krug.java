package zadatak01;

public class Krug extends GeometrijskaFigura {
    private double poluprecnik;

    public Krug(String ime, double poluprecnik) {
        super(ime);
        this.poluprecnik = poluprecnik;
    }

    @Override
    public double povrsina() {
        return poluprecnik * poluprecnik * Math.PI;
    }

    @Override
    public void prikazi() {
        System.out.println("Krug " + ime + " sa poluprecnikom " + poluprecnik);
    }
}
