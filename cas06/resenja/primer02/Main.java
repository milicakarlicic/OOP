package primer04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        Red r = new RedPrekoNiza(4);

        int x;

        while(true) {
            System.out.println("========================================================================================");
            System.out.println("Unesite opciju: 0 - ADD, 1 - REMOVE, 2 - HEAD, 3 - BACK, 4 - SIZE, 5 - SHOW, 6 - EXIT");
            int i = ulaz.nextInt();

            Opcija opcija = Opcija.intUOpciju(i);

            switch (opcija) {
                case Opcija.ADD:
                    System.out.println("Unesite element: ");
                    x = ulaz.nextInt();
                    r.add(x);
                    break;
                case Opcija.REMOVE:
                    r.remove();
                    break;
                case Opcija.HEAD:
                    x = r.head();
                    if (x == Integer.MIN_VALUE) {
                        System.err.println("Red je prazan!");
                    } else {
                        System.out.println("Na pocetku: " + x);
                    }
                    break;
                case Opcija.BACK:
                    x = r.back();
                    if (x == Integer.MIN_VALUE) {
                        System.err.println("Red je prazan!");
                    } else {
                        System.out.println("Na kraju: " + x);
                    }
                    break;
                case Opcija.SIZE:
                    System.out.println("Velicina: " + r.size());
                    break;
                case Opcija.SHOW:
                    r.show();
                    break;
                case Opcija.EXIT:
                    return;
                default:
                    System.err.println("Nepoznata opcija");
            }
        }
    }
}
