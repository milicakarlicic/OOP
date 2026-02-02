package zadatak02;

public class Tim {
    private String ime;
    private int brojPoena;

    public Tim(String ime, int brojPoena) {
        this.ime = ime;
        this.brojPoena = brojPoena;
    }

    public String getIme() {
        return ime;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    @Override
    public String toString() {
        if (brojPoena == Integer.MIN_VALUE) {
            return ime + ": d";
        }
        return ime + ": " + brojPoena;
    }
}
