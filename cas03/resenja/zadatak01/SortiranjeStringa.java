package zadatak01;

import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeStringa {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        String linija = ulaz.nextLine();

        System.out.println(linija);

        char[] pom = linija.toCharArray();
        Arrays.sort(pom);
        linija = String.copyValueOf(pom);
        System.out.println(linija);

        ulaz.close();
    }

}
