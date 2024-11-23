package kloniranje;

public class Buva extends Zivotinja {
    private String ime;

    public Buva(String vrsta, String ime) {
        super(vrsta);
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public void oglasavanje() {
        System.out.println("zzzzzzzzzzzzzzzzz");
    }

    @Override
    public String toString() {
        return "Buva{" +
                "ime='" + ime + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
