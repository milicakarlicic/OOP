package zadatak02;

public class Test {

    public static void main(String[] args) {
        // 6 - ( - (5 + x) * 7), x=1
        // 48
        Izraz i = new Razlika(
                new Konstanta(6),
                new Proizvod(
                        new UnarniMinus(
                                new Zbir(new Konstanta(5),
                                        new Promenljiva("x", 1))) ,
                        new Konstanta(7)));

        System.out.println(i + " = " + i.izracunaj());
    }
}
