package dodatno;

public class Test {

    public static void main(String[] args) {
        Cvor c1 = new Cvor(4);
        Cvor c2 = new Cvor(5);

        JednostrukoPovezanaLista lista = new JednostrukoPovezanaLista();
        lista.dodaj(c1);
        lista.dodaj(c2);
        System.out.println(lista);

        lista.ukloni();
        System.out.println(lista);
    }
}
