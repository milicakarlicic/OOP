package resenja;

import java.util.Arrays;

public class Zadatak06 {

    public static void main(String[] args) {
        int[] niz = {3, 1, 7, 5, 2, 10};

        System.out.println(Arrays.toString(niz));
        Arrays.sort(niz);
        System.out.println(Arrays.toString(niz));
        int poz = Arrays.binarySearch(niz, 9);

        if (poz >= 0) {
            System.out.println("Element 9 se nalazi na poziciji " + poz);
        } else {
            System.out.println("Ne postoji");
        }
    }

}
