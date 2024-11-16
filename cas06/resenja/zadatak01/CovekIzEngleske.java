package cas06.zadatak01;

public class CovekIzEngleske extends Covek implements EngleskiJezik {

    public CovekIzEngleske(String ime, String prezime, int brojGodina) {
        super(ime, prezime, brojGodina);
    }

    @Override
    public void hello() {
        System.out.println(this + ": hello");
    }

    @Override
    public void goodbye() {
        System.out.println(this + ": goodbye");
    }

    @Override
    public String toString() {
        return "CovekIzEngleske " + ime + '\'' +
                prezime + '\'' +
                brojGodina;
    }
}
