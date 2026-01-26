package resenja;

import java.util.Scanner;

public class Zadatak12 {

    // a) i b) domaci

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        String linija = ulaz.nextLine();

        String pom = ulaz.next();

        if (linija.startsWith(pom)) {
            System.out.println("Jeste prefiks");
        } else if (linija.endsWith(pom)) {
            System.out.println("Jeste sufiks");
        }

        ulaz.close();
    }

}
