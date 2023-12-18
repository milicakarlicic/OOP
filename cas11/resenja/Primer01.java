import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Primer01 {

    public static void main(String[] args) {
        BinaryOperator<Integer> zbir = (e1, e2) -> e1 + e2;
        BinaryOperator<Integer> proizvod =  (e1, e2) -> e1 * e2;

        Predicate<Integer> paran = (broj) -> broj % 2 == 0;

        System.out.println(zbir.apply(2 ,4));
        System.out.println(proizvod.apply(2, 4));
        System.out.println(paran.test(10));
    }
}
