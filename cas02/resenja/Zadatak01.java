package resenja;

import java.util.Scanner;

public class Zadatak01 {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();

        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            niz[i] = ulaz.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();

        for (int pom : niz) {
            System.out.print(pom + " ");
        }
        System.out.println();

        ulaz.close();
    }

}
