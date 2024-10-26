package primer02;

public class Test {

    public static void main(String[] args) {
        Tacka t1 = new Tacka();
        Tacka t2 = new Tacka(0, 0);

        if (t1.equals(t2)) {
            System.out.println("jednake su");
        } else {
            System.out.println("nisu jednake");
        }

        System.out.println(t2);
        t2.transliraj(3, 4);
        System.out.println(t2);

        // nestaticka metoda
        System.out.println("rastojanje izmedju " + t1 + " i " + t2 + " je " + t1.rastojanje(t2));
        // staticka metoda
        System.out.println("rastojanje izmedju " + t1 + " i " + t2 + " je " + Tacka.rastojanje(t1, t2));
    }

}
