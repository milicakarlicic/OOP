package zadatak02_03;

public class Test {

    public static void main(String[] args) {
        Trougao t1 = new Trougao(new Tacka(0, 0), new Tacka(1, 2), new Tacka(5, 5), new Tacka(10, 10));
        Elipsa e1 = new Elipsa(10, 5);
        Krug k1 = new Krug(new Tacka(5, 6), 10);

        Trougao t2 = new Trougao(t1);
        Elipsa e2 = new Elipsa(e1);
        Krug k2 = new Krug(k1);

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Original: " + t1);
        System.out.println("Kopija: " + t2);
        System.out.println("Ako u kopiji promijenim x koordinatu centra i tacke A:");
        t2.centar.setX(100);
        t2.getA().setX(100);
        System.out.println("Original: " + t1);
        System.out.println("Kopija: " + t2);

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Original: " + e1);
        System.out.println("Kopija: " + e2);
        System.out.println("Ako u kopiji promijenim x koordinatu centra:");
        e2.centar.setX(100);
        System.out.println("Original: " + e1);
        System.out.println("Kopija: " + e2);

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Original: " + k1);
        System.out.println("Kopija: " + k2);
        System.out.println("Ako u kopiji promijenim x koordinatu centra:");
        k2.centar.setX(100);
        System.out.println("Original: " + k1);
        System.out.println("Kopija: " + k2);

        System.out.println("----------------------------------------------------------------------------------------");

    }

}
