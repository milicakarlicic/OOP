package zadatak1;

public class Main {

    public static void main(String[] args) {
        GeometrijskaFigura[] figure = {new Kvadrat("kv1", 10),
            new Krug("k1", 10), new Pravouogaonik("p1", 10, 5)};
        GeometrijskiSkup gs = new GeometrijskiSkup(figure);

        System.out.println("Ukupna povrsina: " + gs.ukupnaPovrsina());

        for (GeometrijskaFigura gf : gs.getNizFigura()) {
            gf.prikazi();
        }
    }
}
