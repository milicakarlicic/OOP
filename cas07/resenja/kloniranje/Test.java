package kloniranje;

public class Test {

    // 1. nacin
    public static void main(String[] args) throws CloneNotSupportedException {
        Pas pas = new Pas("labrador", "Max", new Buva("pseca", "Marko"));
        Pas klon = (Pas) pas.clone();

        System.out.println(pas);
        System.out.println(klon);
        System.out.println("==============================================");
        klon.getBuva().setIme("Bibi");
        System.out.println(pas);
        System.out.println(klon);
    }

    /* 2. nacin: ne prosledjujemo izuzetak vec ga obradjujemo
    public static void main(String[] args) {
        try {
            Pas pas = new Pas("labrador", "Max", new Buva("pseca", "Marko"));
            Pas klon = (Pas) pas.clone();

            System.out.println(pas);
            System.out.println(klon);
            System.out.println("==============================================");
            klon.getBuva().setIme("Bibi");
            System.out.println(pas);
            System.out.println(klon);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    } */
}
