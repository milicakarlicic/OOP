package resenja;

public class Primer08 {

    public static void main(String[] args) {
        // string pool...
        // String s1 = "ana";
        // String s2 = "ana";
        String s1 = new String("ana");
        String s2 = new String("marko");


		porediPoJednakosti(s1, s2);
		
		porediLeksikografski(s1, s2);
    }
    
    public static void porediPoJednakosti(String s1, String s2) {
    	if (s1 == s2) {
            System.out.println("Identican objekat");
        } else if (s1.equals(s2)) {
            // ako hocemo da zanemarimo velicinu slova: s1.equalsIgnoreCase(s2);
            System.out.println("Objekti jednaki po sadrzaju");
        } else {
            System.out.println("Razliciti objekti");
        }
    }
    
    public static void porediLeksikografski(String s1, String s2) {
    	int rez = s1.compareTo(s2);
        if (rez == 0) {
            System.out.println("Jednaki su");
        } else if (rez > 0) {
            System.out.println("Drugi je ispred prvog");
        }  else {
            System.out.println("Prvi je ispred drugog");
        }
    }

}
