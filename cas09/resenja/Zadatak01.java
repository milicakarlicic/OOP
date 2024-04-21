import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class Zadatak01 {

    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();

        lista.add("string1");
        lista.add("string2");
        lista.add("string3");
        lista.add("string4");

        for (String s : lista) {
            System.out.print(s + " ");
        }
        System.out.println();

        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        StringJoiner sj = new StringJoiner(", ");
        for (String s : lista) {
            sj.add(s);
        }
        System.out.println(sj);

    }

}
