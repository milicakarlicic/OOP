package primer03;

public class Main {

    public static void main(String[] args) {
        Covek c1 = new CovekIzSrbije("Marko", "Markovic", 25);
        EngleskiJezik c2 = new CovekIzSrbije("Petar", "Petrovic", 20);
        SrpskiJezik c3 = new CovekIzSrbije("Ana", "Andric", 19);

        // koje sve metode mozemo pozvati nad promenljivom c1, koje nad c2 i koje nad c3?
        System.out.println(c1);

        c2.hello();

        c3.zdravo();

        System.out.println("===================================================");

        if (c1 instanceof Covek) {
            System.out.println("Promenljiva c1 pripada klasi Covek");
        }
        if (c1 instanceof CovekIzSrbije) {
            System.out.println("Promenljiva c1 pripada klasi CovekIzSrbije");
        }
        if (c1 instanceof EngleskiJezik) {
            System.out.println("Klasa kojoj pripada promenljiva c1 implementira interfejs EngleskiJezik");
        }
        if (c1 instanceof SrpskiJezik) {
            System.out.println("Klasa kojoj pripada promenljiva c1 implementira interfejs SrpskiJezik");
        }
    }
}
