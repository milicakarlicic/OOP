package mapa;

public class Student implements Comparable<Student> {
    private String ime;
    private String prezime;

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public int compareTo(Student o) {
        return prezime.equals(o.prezime) ?
                ime.compareTo(o.ime) : prezime.compareTo(o.prezime);
    }
}
