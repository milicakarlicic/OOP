import java.util.Arrays;
import java.util.Scanner;

public class Primer13 {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        String linija = ulaz.nextLine();

        String[] reci = linija.split(" ");
        System.out.println(Arrays.toString(reci));

        ulaz.close();
    }
}
