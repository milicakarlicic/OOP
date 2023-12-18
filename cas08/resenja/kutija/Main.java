package kutija;

public class Main {

    public static void main(String[] args) {
        Kutija<Tacka> k = new Kutija<>();

        System.out.println(k);
        try {
            k.ubaciUKutiju(new Tacka());
        } catch (MojIzuzetak e) {
            System.out.println(e.getMessage());;
        }

        System.out.println(k);
        try {
            k.uzmiIzKutije();
            System.out.println(k);
            k.uzmiIzKutije();
            System.out.println(k);
        } catch (MojIzuzetak e) {
            System.out.println(e.getMessage());
        }
    }
}
