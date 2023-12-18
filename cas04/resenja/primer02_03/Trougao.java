package primer02;

public class Trougao extends Oblik {
    private Tacka a;
    private Tacka b;
    private Tacka c;

    public Trougao(Tacka a, Tacka b, Tacka c) {
        // super();
        inic(a, b, c);
    }

    public Trougao(Tacka centar, Tacka a, Tacka b, Tacka c) {
        super(centar);
        inic(a, b, c);
    }

    public Trougao(Trougao t) {
        super(t.centar);
        inic(t.a, t.b, t.c);
    }

    public Tacka getA() {
        return a;
    }

    private void inic(Tacka a, Tacka b, Tacka c) {
        this.a = new Tacka(a);
        this.b = new Tacka(b);
        this.c = new Tacka(c);
    }

    @Override
    public String toString() {
        return "Trougao sa tjemenima " + a + ", " + b + ", " + c + " i centrom " + centar;
    }
}
