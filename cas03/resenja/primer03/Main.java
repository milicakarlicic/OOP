package primer03;

public class Main {

    public static void main(String[] args) {
        Stek s = new Stek();

        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);

        int x = s.pop();
        if (x == Integer.MAX_VALUE) {
            System.err.println("Stek je prazan!");
        } else {
            System.out.println("Skinuli element: " + x);
        }

        System.out.println(s);

    }

}
