package primer01;


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Marko", "Markovic", "mi22002", 10);
        StudentSaI s2 = new StudentSaI("Ana", "Markovic", "mi22101", 7.5, 10);
        StudentSaR s3 = new StudentSaR("Jana", "Markovic", "mi22102", 7.5, 10);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
