package zadatak01;

public abstract class Oblik { // new Oblik()
    protected Tacka centar;

    public Oblik() {
        this(new Tacka());
    }

    public Oblik(Tacka centar) {
        this.centar = new Tacka(centar);
    }

    public Oblik(Oblik o) {
        this(o.centar);
    }

    public abstract double obim();

    public abstract double povrsina();
}
