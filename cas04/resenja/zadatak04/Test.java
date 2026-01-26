package zadatak04;

public class Test {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstanca();

        s1.ispis();
        s1.ispis();
        s1.ispis();

        Singleton s2 = Singleton.getInstanca();
        if (s1 == s2) {
            System.out.println("Iste reference, dakle, isti objekat je u pitanju!");
        }

        // instancu ne moramo imenovati mozemo joj uvijek pristupati preko get metode
        Singleton.getInstanca().ispis();
        Singleton.getInstanca().ispis();
        Singleton.getInstanca().ispis();
    }

}
