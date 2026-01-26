package resenja;

import java.util.Scanner;

public class Zadatak02 {

    public static void main(String[] args) {
        int[] niz = inic();

        ispisi1(niz);
        // ispisi2 domaci
    }

    static int[] inic() {
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();

        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            niz[i] = ulaz.nextInt();
        }

        return niz;
    }

    static void ispisi1(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

}
