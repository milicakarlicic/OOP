package izuzeci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak03 {

    public static void main(String[] args) {
        String s = "Marko Markovic 20 8.5";

        // try with resources - mozemo otvarati vise resursa
        // formatirano citanje iz stringa
        try (Scanner ulaz = new Scanner(System.in); Scanner ulazIzStringa = new Scanner(s)) {
            String ime = ulazIzStringa.next();
            String prezime = ulazIzStringa.next();
            int godine = ulazIzStringa.nextInt();
            double prosek = ulazIzStringa.nextDouble();

            System.out.println(ime + " " + prezime + " " + godine + " " + prosek);
        } catch (ArithmeticException | InputMismatchException e) {
            // mozemo spojiti catch blokove ukoliko imaju iste naredbe
            System.out.println("desio se neki exception");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("desilo se nesto sto nismo ocekivali");
            System.exit(1);
        }
    }
}
