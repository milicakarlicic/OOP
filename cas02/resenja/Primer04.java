import java.util.Arrays;

public class Primer04 {
    // ispisi1 domaci
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

    public static void main(String[] args) {
        int[][] matrica = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ispisi2(matrica);
        ispisi3(matrica);
    }

}
