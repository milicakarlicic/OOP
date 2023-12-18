import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Stream;

public class Primer04 {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>(Arrays.asList("t"));
        Optional<String> prvi = l.stream().findFirst();

        if (prvi.isPresent()) {
            System.out.println(prvi.get());
        }
    }
}
