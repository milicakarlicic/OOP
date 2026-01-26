package zadatak01;

public class GeometrijskiSkup {
    private GeometrijskaFigura[] nizFigura;

    public GeometrijskiSkup(GeometrijskaFigura[] nizFigura) {
        this.nizFigura = nizFigura;
    }

    public GeometrijskaFigura[] getNizFigura() {
        return nizFigura;
    }

    public double ukupnaPovrsina() {
        double ukupnaPovrsina = 0;

        for (GeometrijskaFigura gf : nizFigura) {
            ukupnaPovrsina += gf.povrsina();
        }

        return ukupnaPovrsina;
    }
}
