package primer01;

public class StudentSaI extends Student {
    private int ocenaIzDS;

    public StudentSaI(String ime, String prezime, String alas, double prosek, int ocenaIzDS) {
        super(ime, prezime, alas, prosek);
        this.ocenaIzDS = ocenaIzDS;
    }

    @Override
    public String toString() {
        return super.toString() + ", iz DS imam ocenu " + ocenaIzDS;
    }
}
