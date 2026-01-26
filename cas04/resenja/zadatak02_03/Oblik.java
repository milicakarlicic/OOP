package zadatak02_03;

public class Oblik {
    protected Tacka centar;

    public Oblik() {
        this(new Tacka());
    }

    public Oblik(Tacka centar) {
        this.centar = new Tacka(centar);
    }

    public Oblik(Oblik o) { this(o.centar); }
}
