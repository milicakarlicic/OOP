package primer03;

public class CovekIzEngleske extends Covek implements EngleskiJezik {

    public CovekIzEngleske(String ime, String prezime, int godine) {
        super(ime, prezime, godine);
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void goodbye() {
        System.out.println("goodbye");
    }
}
