package izuzeci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Primer05 {
    // NullPointerException voditi racuna na ispitu!!!
    private static Scanner ulaz;

    public static void main(String[] args) {
        try {
            int x = ulaz.nextInt();
            System.out.println(x);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("desilo se nesto sto nismo ocekivali");
            System.exit(1);
        } finally {
            if (ulaz != null) {
                ulaz.close();
            }
        }
    }
}
