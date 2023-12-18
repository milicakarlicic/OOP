import java.util.Arrays;

public class Primer06 {

    public static void main(String[] args) {
        int[] niz = {3, 1, 7, 5, 2, 10};

        System.out.println(Arrays.toString(niz));
        Arrays.sort(niz);
        System.out.println(Arrays.toString(niz));
        int poz = Arrays.binarySearch(niz, 9);

        if (poz >= 0) {
            System.out.println("nadjen na poziciji " + poz);
        } else {
            System.out.println("kada bi postojao bio bi na poziciji " + (- poz - 1));
        }
    }

}
