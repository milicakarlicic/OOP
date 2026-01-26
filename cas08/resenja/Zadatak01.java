package cas08;

public class Zadatak01 {

    public static <T> T ispisi(T element) {
        System.out.println(element);
        return element;
    }

    public static void main(String[] args) {
        Integer s = ispisi(1);
        ispisi("ana");
        ispisi(true);
    }
}
