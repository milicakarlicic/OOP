package zadatak01;

public class PoredjenjeBrzine {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "";

        int n = 20;
        String pom = "matf";

        long pocetak = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append(pom);
        }
        long kraj = System.nanoTime();
        System.out.println("StringBuilder: " + (kraj - pocetak));
        System.out.println(sb);

        pocetak = System.nanoTime();
        for (int i = 0; i < n; i++) {
            s += pom;
        }
        kraj = System.nanoTime();
        System.out.println("String: " + (kraj - pocetak));
        System.out.println(s);
    }

}
