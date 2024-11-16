package cas06.zadatak01;

public abstract class Covek {
    protected String ime;
    protected String prezime;
    protected int brojGodina;

    public Covek(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }
}
