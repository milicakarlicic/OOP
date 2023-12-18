package primer03;

public abstract class Covek {
    private String ime;
    private String prezime;
    private int godine;

    public Covek(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + godine;
    }
}
