package resenja;

public class Primer11 {

    public static void main(String[] args) {
        String dnk = "acgtcacgtcacagatgctcgatcgatgcaatgcgatatgcatgc";
        String chuck = "atgc";

        int brojac = 0;

        int indeks = dnk.indexOf(chuck);
        while(indeks != -1) {
            brojac++;
            dnk = dnk.substring(indeks + chuck.length());
            indeks = dnk.indexOf(chuck);
        }

        System.out.println(brojac);
    }

}
