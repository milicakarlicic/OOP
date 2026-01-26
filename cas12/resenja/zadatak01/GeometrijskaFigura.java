package zadatak01;

public abstract class GeometrijskaFigura implements Ispis {
    protected String ime;

    public GeometrijskaFigura(String ime) {
        this.ime = ime;
    }

    public abstract double povrsina();
}
