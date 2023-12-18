package primer00;

public class TestiranjeStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("mmatematicki");
        sb.append("fakultet");
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.insert(11, " ");
        System.out.println(sb);

        sb.setCharAt(0, 'M');
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        // ...
    }

}
