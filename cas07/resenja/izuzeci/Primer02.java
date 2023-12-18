package izuzeci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Primer02 {

    // vise catch grana i finally blok
    // obratiti paznju na redosled pisanja na standardni izlaz i na standardni izlaz za greske
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        try {
            int x = ulaz.nextInt();
            int y = ulaz.nextInt();

            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println("los ulaz");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("desilo se nesto sto nismo ocekivali");
            System.exit(1);
        } finally {
            System.out.println("zavrsen try/catch");
            ulaz.close();
        }
    }
}
