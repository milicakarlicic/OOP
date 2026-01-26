package zadatak01;

public class Trougao extends Oblik {
    private Tacka a;
    private Tacka b;
    private Tacka c;

    public Trougao(Tacka a, Tacka b, Tacka c) {
        //super();
        inic(a, b, c);
    }

    public Trougao(Tacka centar, Tacka a, Tacka b, Tacka c) {
        super(centar);
        inic(a, b, c);
    }

    public Trougao(Trougao t) {
        this(t.centar, t.a, t.b, t.c);
    }

    private void inic(Tacka a, Tacka b, Tacka c) {
        this.a = new Tacka(a);
        this.b = new Tacka(b);
        this.c = new Tacka(c);
    }

    public Tacka getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Trougao sa tjemenima " + a + ", " + b + ", " + c + " i centrom " + centar;
    }

    public double strA() {
        return Tacka.rastojanje(b, c);
    }

    public double strB() {
        return Tacka.rastojanje(a, c);
    }

    public double strC() {
        return Tacka.rastojanje(b, a);
    }

    @Override
    public double obim() {
        return strA() + strB() + strC();
    }

    @Override
    public double povrsina() {
        double h = obim() / 2;
        return Math.sqrt(h * (h - strA()) * (h - strB()) * (h - strC()));
    }
}
