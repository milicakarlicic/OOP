package opciona_vrednost;

public class Test {

    public static void main(String[] args) {
        Integer[] niz = {4, 5, 1, 3, -2};

        OpcionaVrednost<Integer> maks = nadjiMaks(niz);
        if (maks.postoji()) {
        	System.out.println("postoji maksimum i jednak je: " + maks.getVrednost());
        } else {
        	System.out.println("ne postoji maksimum jer je niz prazan");
        }
    }

    public static <T extends Comparable<T>> OpcionaVrednost<T> nadjiMaks(T[] niz) {
        if (niz.length == 0) {
            return OpcionaVrednost.prazan();
        }

        T maks = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (maks.compareTo(niz[i]) < 0) {
                maks = niz[i];
            }
        }

        return OpcionaVrednost.od(maks);
    }
}
