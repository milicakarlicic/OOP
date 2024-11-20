package primer02;

public class Tacka {
    private double x;
    private double y;

    private static int brojac = 0;

    static {
    	// staticki blok - za kompleksniju inicijalizaciju statickih promenljivih (jedna od primena)
        brojac = 0;
        for (int i = 0; i < 10; i++) {
            brojac = 0;
        }
    }

    public Tacka() {
        this(0, 0);
    }

    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;

        brojac++;
    }

    public Tacka(Tacka t) {
        this(t.x, t.y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public static int getBrojac() {
        return brojac;
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
