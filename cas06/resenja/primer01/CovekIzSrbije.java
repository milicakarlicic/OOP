package primer03;

public class CovekIzSrbije extends Covek implements EngleskiJezik, SrpskiJezik {

    public CovekIzSrbije(String ime, String prezime, int godine) {
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

    @Override
    public void zdravo() {
        System.out.println("zdravo");
    }

    @Override
    public void dovidjenja() {
        System.out.println("dovidjenja");
    }
}
