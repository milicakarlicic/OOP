import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Zadatak07 {

    public static void main(String[] args) {
        List<String> lista = new LinkedList<>(
                Arrays.asList(
                        "coijoiauoi", "ijoija", "caijoicjao",
                        "cccc", "pokoijc"
                )
        );

        System.out.println(lista);

        lista.stream()
                .filter(e -> e.charAt(0) == 'c')
                .map(e -> e.toUpperCase())
                .sorted()
                .forEach(e -> System.out.print(e + " "));
    }
}
