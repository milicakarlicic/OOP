import java.util.*;

public class Primer02 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(4, 1, 6, 9, 10, 7));

        System.out.println("Max: " + Collections.max(lista));
        System.out.println("Min: " + Collections.min(lista));

        Collections.sort(lista);
        System.out.println("Sortirana: " + lista);

        Scanner ulaz = new Scanner(System.in);
        System.out.print("Unesite broj rotacije: ");
        int k = ulaz.nextInt();
        ulaz.close();
        Collections.rotate(lista, k);
        System.out.println("Rotirana: " + lista);
    }
}
