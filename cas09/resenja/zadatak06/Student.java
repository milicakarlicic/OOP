package zadatak06;

public class Student implements Comparable<Student> {
    private String alas;
    private String ime;

    public Student(String alas, String ime) {
        this.alas = alas;
        this.ime = ime;
    }

    @Override
    public String toString() {
        return ime + " " + alas;
    }
    
    // Ukoliko se koristi HashMap:

    // @Override
    // public int hashCode() {
    //     return 13 * alas.hashCode() + 17 * ime.hashCode();
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     return compareTo((Student) obj) == 0;
    // }

    @Override
    public int compareTo(Student o) {
        return alas.compareTo(o.alas);
    }
}
