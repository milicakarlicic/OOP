import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Primer03 {

    public static void main(String[] args) {
        Set<Integer> s1 = new TreeSet<>();

        s1.add(5);
        s1.add(4);
        s1.add(4);
        s1.add(10);
        s1.add(3);
        s1.add(-4);
        s1.add(6);
        System.out.print("s1: ");
        for (int i : s1) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Iterator<Integer> it = s1.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }

        Set<Integer> s2 = new TreeSet<>();

        s2.add(5);
        s2.add(0);
        s2.add(4);
        s2.add(1);
        s2.add(3);
        System.out.print("s2: ");
        for (int i : s2) {
            System.out.print(i + " ");
        }
        System.out.println();

        Set<Integer> s1Unijes2 = new TreeSet<>(s1);
        s1Unijes2.addAll(s2);
        System.out.println("unija: " + s1Unijes2);

        Set<Integer> s1Preseks2 = new TreeSet<>(s1);
        s1Preseks2.retainAll(s2);
        System.out.println("presek: " + s1Preseks2);

        Set<Integer> s1Razlikas2 = new TreeSet<>(s1);
        s1Razlikas2.removeAll(s2);
        System.out.println("razlika: " + s1Razlikas2);

    }
}
