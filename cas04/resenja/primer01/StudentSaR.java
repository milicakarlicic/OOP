package primer01;

public class StudentSaR extends Student {
    private int ocenaIzUML;

    public StudentSaR(String ime, String prezime, String alas, double prosek, int ocenaIzUML) {
        super(ime, prezime, alas, prosek);
        this.ocenaIzUML = ocenaIzUML;
    }

    @Override
    public String toString() {
        return super.toString() + ", iz UML imam ocenu " + ocenaIzUML;
    }
}
