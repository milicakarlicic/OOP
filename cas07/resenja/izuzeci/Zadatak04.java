package izuzeci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak04 {

    // primer kada metod izbacuje izuzetak i oznacavanje da se izbacuje izuzetak u potpisu metoda
    public static int pom(Scanner ulaz) throws InputMismatchException {
        int x;
        if (ulaz.hasNextInt()) {
            x = ulaz.nextInt();
        } else {
            throw new InputMismatchException();
        }

        return x;
    }

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        try {
            int x = pom(ulaz);
            System.out.println(x);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
