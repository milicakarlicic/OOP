package resenja;

import java.util.Arrays;

public class Zadatak04 {

	public static void main(String[] args) {
        int[][] matrica = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		// ispisi1 domaci
        ispisi2(matrica);
        ispisi3(matrica);
    }
   
     static void ispisi2(int[][] m) {
        for (int[] vrsta : m) {
            for (int pom : vrsta) {
                System.out.print(pom + " ");
            }
            System.out.println();
        }
    }

     static void ispisi3(int[][] m) {
        System.out.println(Arrays.deepToString(m));
    }

}
