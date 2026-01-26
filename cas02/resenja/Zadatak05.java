package resenja;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        int n = ulaz.nextInt();
        int m = ulaz.nextInt();

        int[][] matrica = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrica[i][j] = ulaz.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(matrica));
        razmeni1(matrica, 0, 1);
        System.out.println(Arrays.deepToString(matrica));
        razmeni2(matrica, 0, 1);
        System.out.println(Arrays.deepToString(matrica));

        ulaz.close();
    }

     static void razmeni1(int[][] m, int i, int j) {
        for (int k = 0; k < m[i].length; k++) {
            int pom = m[i][k];
            m[i][k] = m[j][k];
            m[j][k] = pom;
        }
    }

     static void razmeni2(int[][] m, int i, int j) {
        int[] pom = m[i];
        m[i] = m[j];
        m[j] = pom;
    }

}
