package resenja;

import java.util.Scanner;

public class Primer09 {

    // brojimo slova, ostatak za domaci

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        String linija = ulaz.nextLine();

        int brSlova = 0;
        for (int i = 0; i < linija.length(); i++) {
            if (Character.isLetter(linija.charAt(i))) {
                brSlova++;
            }
        }

        System.out.println("broj slova: " + brSlova);

        ulaz.close();
    }

}
