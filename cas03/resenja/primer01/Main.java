package primer01;


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Marko", "Markovic", "mi22002", 10);
        Student s2 = new Student("Ana", "Markovic", "mi22101", 7.5);

        System.out.println(s1);
        System.out.println(s2.getIme() + " ima alas nalog: " + s2.getAlas());
    }
}
