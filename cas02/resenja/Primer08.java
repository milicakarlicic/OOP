
public class Primer08 {

    public static void main(String[] args) {
        // string pool...
        // String s1 = "ana";
        // String s2 = "ana";
        String s1 = new String("ana");
        String s2 = new String("marko");

        // poredjenje po jednakosti
        if (s1 == s2) {
            System.out.println("identicni objekti");
        } else if (s1.equals(s2)) {
            // ako hocemo da zanemarimo velicinu slova: s1.equalsIgnoreCase(s2);
            System.out.println("objekti jednaki po sadrzaju");
        } else {
            System.out.println("razliciti objekti");
        }

        // leksikografsko poredjenje
        int rez = s1.compareTo(s2);
        if (rez == 0) {
            System.out.println("jednaki su");
        } else if (rez > 0) {
            System.out.println("drugi je ispred prvog");
        }  else {
            System.out.println("prvi je ispred drugog");
        }
    }

}
