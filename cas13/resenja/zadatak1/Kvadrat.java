package zadatak1;

public class Kvadrat extends GeometrijskaFigura {
    private double duzinaStranice;

    public Kvadrat(String ime, double duzinaStranice) {
        super(ime);
        this.duzinaStranice = duzinaStranice;
    }

    @Override
    public double povrsina() {
        return Math.pow(duzinaStranice, 2);
    }

    @Override
    public void prikazi() {
        System.out.println("Kvadrat " + ime + " sa duzinom stranice " + duzinaStranice);
    }
}
