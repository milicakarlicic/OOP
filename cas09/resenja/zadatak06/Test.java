package zadatak06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {
        Map<Student, List<Integer>> studenti = new TreeMap<>();

        studenti.put(new Student("mm21002", "marko"),
                Arrays.asList(9, 9, 9));
        studenti.put(new Student("mv22001", "nina"),
                Arrays.asList(10, 10, 10, 10));
        studenti.put(new Student("mv22101", "milos"),
                Arrays.asList(9, 6, 6));
        studenti.put(new Student("mm21010", "ana"),
                Arrays.asList(9, 8, 7));
        studenti.put(new Student("ml22201", "jovan"),
                Arrays.asList(10, 10, 10, 10));
        
        Set<Student> kljucevi = studenti.keySet();
        for (Student kljuc : kljucevi) {
            List<Integer> ocene = studenti.get(kljuc);

            double prosek = 0;
            for (int ocena : ocene) {
                prosek += ocena;
            }
            prosek /= ocene.size();

            System.out.println(kljuc + ": " + prosek);
        }
    }
    
}
