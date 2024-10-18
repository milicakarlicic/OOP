package resenja;

import java.util.Scanner;

public class Primer03 {

	public static void main(String[] args) {
        int[] niz = inic();

        ispisi(niz);
        pomnoziKonstantom(niz, 5);
        ispisi(niz);
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

     static void ispisi(int[] niz) {
        for (int j : niz) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

     static void pomnoziKonstantom(int[] niz, int konst) {
        for (int i = 0; i < niz.length; i++) {
            niz[i] *= konst;
        }
    }

}
