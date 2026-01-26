package zadatak04;

public class Singleton {
    private static Singleton instanca = null;

    private Singleton() {}

    public static Singleton getInstanca() {
        if (instanca == null) {
            instanca = new Singleton();
        }
        return instanca;
    }

    public void ispis() {
        System.out.println("Singleton klasa je klasa od koje je moguce napraviti samo jednu instancu!");
    }
}
