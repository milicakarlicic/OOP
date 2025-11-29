package dodatno;

public class JednostrukoPovezanaLista {
    private Cvor pocetak; // null

    public void dodaj(Cvor c) {
        if (pocetak == null) {
            pocetak = c;
        } else {
            // (1) -> (2) -> (3) -> null
            Cvor pom = pocetak;
            while (pom.getSledeci() != null) {
                pom = pom.getSledeci();
            }
            pom.setSledeci(c);
        }
    }

    public void ukloni() {
        if (pocetak == null) {
            return;
        } else if (pocetak.getSledeci() == null) {
            // (5) -> null
            pocetak = null;
        }
        Cvor pom = pocetak;
        while (pom.getSledeci().getSledeci() != null) {
            pom = pom.getSledeci();
        }
        pom.setSledeci(null);
    }

    public String toString() {
        Cvor pom = pocetak;
        StringBuilder sb = new StringBuilder();

        while (pom != null) {
            sb.append(pom);
            pom = pom.getSledeci();
        }
        return sb.toString();
    }

}
