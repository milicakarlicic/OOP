package primer01;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Marko", "Markovic", "mi23002", 8.0);
        Student s2 = new Student("Ana", "Markovic", "mi23101", 9.5);

        System.out.println(s1);
        System.out.println(s2.getIme() + " ima alas nalog: " + s2.getAlas());
    }
}
