package kloniranje;

public class Pas extends Zivotinja {
    private String ime;
    private Buva buva;

    public Pas(String vrsta, String ime, Buva buva) throws CloneNotSupportedException {
        super(vrsta);
        this.ime = ime;
        this.buva = (Buva) buva.clone(); // ili pozovemo neki konstruktor iz klase Buva
    }

    public Buva getBuva() {
        return buva;
    }

    @Override
    public void oglasavanje() {
        System.out.println("av av");
    }

    @Override
    public String toString() {
        return "Pas{" +
                "ime='" + ime + '\'' +
                ", buva=" + buva +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Pas klon = (Pas) super.clone();
        klon.buva = (Buva) klon.buva.clone();

        return klon;
    }
}
