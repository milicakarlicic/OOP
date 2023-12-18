import java.util.Scanner;
import java.util.stream.IntStream;

public class Primer03 {

    public static void main(String[] args) {
        try (Scanner ulaz = new Scanner(System.in)) {
            int n = ulaz.nextInt();

            IntStream.range(2, n + 1)
                    .filter(e -> e % 2 == 0)
                    .map(e -> e * e)
                    .forEach(e -> System.out.print(e + " "));
        }
    }
}
