package primer02;

public class Tacka {
    private double x;
    private double y;

    public Tacka() {
        // ukoliko ne postoji kolizija imena poljima tekuceg objekta se moze
        // pristupati i samo pomocu njihovog imena
        x = 0;
        y = 0;
    }

    public Tacka(double x, double y) {
        // ukoliko postoji kolizija imena poljima tekuceg objekta moramo
        // pristupati koriscenjem kljucne rijeci this koja predstavlja
        // referencu na tekuci objekat
        this.x = x;
        this.y = y;
    }

    public boolean equals(Tacka t) {
        return x == t.x && y == t.y;
    }

    public void transliraj(double px, double py) {
        x += px;
        y += py;
    }

    public double rastojanje(Tacka t) {
        return Math.sqrt(Math.pow(x - t.x, 2) + Math.pow(y - t.y, 2));
    }

    public static double rastojanje(Tacka t1, Tacka t2) {
        return Math.sqrt(Math.pow(t1.x - t2.x, 2) + Math.pow(t1.y - t2.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
