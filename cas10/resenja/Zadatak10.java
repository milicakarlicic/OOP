import java.util.Comparator;
import java.util.stream.Stream;

public class Zadatak10 {

    public static void main(String[] args) {
        Stream.of("neki1", "aliNa", "blabla", "ana", "marko", "segment", "oracle")
                .sorted(Comparator.comparingInt(e -> e.charAt(1)))
                .filter(e -> e.startsWith("a"))
                .map(String::toUpperCase)
                .forEach(e -> System.out.print(e + "  "));
    }
}
