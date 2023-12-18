package izuzeci;

public class Primer01 {

    // kako citamo stack trace?
    public static void pom2() {
        int x = 10;

        // try/catch blok koji se koristi za obradu izuzetaka
        try {
            System.out.println(x / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void pom1() {
        pom2();
    }

    public static void main(String[] args) {
        pom1();
    }
}
