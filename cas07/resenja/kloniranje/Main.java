package kloniranje;

public class Main {

    // 1. nacin
    public static void main(String[] args) throws CloneNotSupportedException {
        Pas p1 = new Pas("labrador", "Max", new Buva("pseca", "Marko"));
        Pas p2 = (Pas) p1.clone();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("==============================================");
        p2.getBuva().setIme("Bibi");
        System.out.println(p1);
        System.out.println(p2);
    }

    /* 2. nacin: ne prosledjujemo izuzetak vec ga obradjujemo
    public static void main(String[] args) {
        try {
            Pas p1 = new Pas("labrador", "Max", new Buva("pseca", "Marko"));
            Pas p2 = (Pas) p1.clone();

            System.out.println(p1);
            System.out.println(p2);
            System.out.println("==============================================");
            p2.getBuva().setIme("Bibi");
            System.out.println(p1);
            System.out.println(p2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    } */
}
