package primer01;

public class Student {
    private String ime;
    private String prezime;
    private String alas;
    private double prosek;

    public Student(String ime, String prezime, String alas, double prosek) {
        this.ime = ime;
        this.prezime = prezime;
        this.alas = alas;
        this.prosek = prosek;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getAlas() {
        return alas;
    }

    public double getProsek() {
        return prosek;
    }

    public void setAlas(String alas) {
        if (validirajAlas(alas)) {
            this.alas = alas;
        } else {
            System.err.println("nevalidan alas");
        }
    }

    private boolean validirajAlas(String alas) {
        if (alas.length() != 7) {
            System.err.println("nevalidna duzina");
            return false;
        } else if (alas.charAt(0) != 'm') {
            System.err.println("nevalidan modul");
            return false;
        } else if (alas.charAt(1) != 'r' && alas.charAt(1) != 'i') {
            System.err.println("nevalidan smer");
            return false;
        } else {
            for (int i = 2; i < alas.length(); i++) {
                if (!Character.isDigit(alas.charAt(i))) {
                    System.err.println("nevalidan indeks");
                    return false;
                }
            }

            return true;
        }

    }

    public String toString() {
        return ime + " " + prezime + " " + alas + " " + prosek;
    }
}
