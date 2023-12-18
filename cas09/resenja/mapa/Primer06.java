package mapa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Primer06 {

    public static void main(String[] args) {
        Map<Student, List<Integer>> studenti = new TreeMap<>();

        studenti.put(new Student("marko", "markovic"),
                Arrays.asList(9, 9, 9));
        studenti.put(new Student("nina", "markovic"),
                Arrays.asList(10, 10, 10, 10));
        studenti.put(new Student("milos", "jovic"),
                Arrays.asList(9, 6, 6));
        studenti.put(new Student("ana", "anic"),
                Arrays.asList(9, 8, 7));
        studenti.put(new Student("jovan", "jovic"),
                Arrays.asList(10, 10, 10, 10));

        for (Map.Entry<Student, List<Integer>> student : studenti.entrySet()) {
            System.out.print(student.getKey() + ": ");

            List<Integer> ocene = student.getValue();
            double prosek = 0;
            for (int ocena : ocene) {
                prosek += ocena;
            }
            prosek /= ocene.size();
            System.out.println(prosek);
        }
    }
}
