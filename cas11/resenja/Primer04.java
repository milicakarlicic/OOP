import java.util.stream.Stream;

public class Primer04 {

    public static void main(String[] args) {
        Stream.of(6, 1, 2, 4, 9, 10, 0)
                .map(e -> "a" + e)
                .forEach(e -> System.out.print(e + " "));
    }
}
