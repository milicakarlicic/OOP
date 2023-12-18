import java.util.Scanner;

public class Primer10 {

//    Sa standardnog ulaza ucitati liniju. Napisati funkciju koja sva slova ucitane
//    linije konvertuje u mala slova. Koristeci funkcije klase String
//    ispisati ucitanu liniju bez belina kao i sa svim velikim
//    slovima.

    public static String uMalaSlova(String linija) {
        char[] niz = linija.toCharArray();

        for (int i = 0; i < niz.length; i++) {
            niz[i] = Character.toLowerCase(niz[i]);
        }

        return String.copyValueOf(niz);
    }

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        String linija = ulaz.nextLine();
        System.out.println(linija);

        linija = uMalaSlova(linija);
        System.out.println(linija);

        System.out.println(linija.toUpperCase());

        System.out.println(linija.replace(" ", ""));

        ulaz.close();
    }

}
