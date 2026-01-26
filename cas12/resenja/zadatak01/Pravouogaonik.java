package zadatak01;

public class Pravouogaonik extends GeometrijskaFigura {
    private double duzina;
    private double sirina;

    public Pravouogaonik(String ime, double duzina, double sirina) {
        super(ime);
        this.duzina = duzina;
        this.sirina = sirina;
    }

    @Override
    public double povrsina() {
        return duzina * sirina;
    }

    @Override
    public void prikazi() {
        System.out.println("Pravaougaonik" + ime + " sa duzinom " +
                duzina + " i sirinom " + sirina);
    }
}
