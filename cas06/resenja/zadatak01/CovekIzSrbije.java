package cas06.zadatak01;

public class CovekIzSrbije extends Covek implements EngleskiJezik, SrpskiJezik {

    public CovekIzSrbije(String ime, String prezime, int brojGodina) {
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
    public void zdravo() {
        System.out.println(this + ": zdravo");
    }

    @Override
    public void dovidjenja() {
        System.out.println(this + ": dovidjenja");
    }

    @Override
    public String toString() {
        return "CovekIzSrbije " + ime + " " + prezime + " " + brojGodina;
    }
}
