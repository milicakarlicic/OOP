package dodatno;

public class Cvor {
    private int vrednost;
    private Cvor sledeci;

    public Cvor getSledeci() {
        return sledeci;
    }

    public void setSledeci(Cvor sledeci) {
        this.sledeci = sledeci;
    }

    public Cvor(int vrednost) {
        this.vrednost = vrednost;
    }

    public String toString() {
        return " " + vrednost + " ";
    }
}
