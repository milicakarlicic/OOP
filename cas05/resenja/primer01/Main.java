package primer01;

public class Main {
    public static void main(String[] args) {
        Elipsa e1 = new Elipsa(10, 5);
        Krug k1 = new Krug(10);
        Trougao t1 = new Trougao(new Tacka(1, 1), new Tacka(1, 2), new Tacka(4, 10), new Tacka(10, -5));

        Elipsa e2 = new Elipsa(10, 5);
        Krug k2 = new Krug(10);
        Trougao t2 = new Trougao(new Tacka(1, 1), new Tacka(1, 2), new Tacka(4, 10), new Tacka(10, -5));

        Elipsa e3 = new Elipsa(e1);
        Krug k3 = new Krug(k2);
        Trougao t3 = new Trougao(t1);

        Oblik[] nizOblika = {e1, e2, e3, t1, t2, t3, k1, k2, k3};

        for (Oblik o : nizOblika) {
            System.out.println(o);
            System.out.println("Sa povrsinom: " + o.povrsina() + " i obimom: " + o.obim());
        }

        System.out.println("===============================================================");

        int brojacElipsi = 0;
        for (Oblik o : nizOblika) {
            if (o instanceof Elipsa) {
                brojacElipsi++;
            }
        }
        System.out.println("Broj elipsi: " + brojacElipsi);

        int brojacElipsiKojeNisuKrugovi = 0;
        for (Oblik o : nizOblika) {
            if (o.getClass() == Elipsa.class) {
                brojacElipsiKojeNisuKrugovi++;
            }
        }
        System.out.println("Broj elipsi koje nisu krugovi: " + brojacElipsiKojeNisuKrugovi);

    }
}
