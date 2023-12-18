import java.util.Arrays;

public class Primer07 {

    public static void main(String[] args) {
        int[] niz = new int[5];
        System.out.println(Arrays.toString(niz));
        Arrays.fill(niz, 101);
        System.out.println("original: " + Arrays.toString(niz));

        int[] kopija = Arrays.copyOf(niz, niz.length);
        System.out.println("kopija " + Arrays.toString(kopija));

        int[] podniz = Arrays.copyOfRange(niz, 2, 4);
        System.out.println("podniz " + Arrays.toString(podniz));
    }
}
