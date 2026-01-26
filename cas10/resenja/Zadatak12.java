import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Zadatak12 {

    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>(
                Arrays.asList(5, 5, 4, 6)
        );

        lista.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
