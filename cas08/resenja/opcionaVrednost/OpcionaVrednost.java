package opcionaVrednost;

public class OpcionaVrednost<T> {
    private static OpcionaVrednost<?> PRAZAN = new OpcionaVrednost<>();

    private T vrednost;

    private OpcionaVrednost() {}

    private OpcionaVrednost(T vrednost) {
        this.vrednost = vrednost;
    }

    public static <E> OpcionaVrednost<E> prazan() {
        return (OpcionaVrednost<E>) PRAZAN;
    }

    public static <T> OpcionaVrednost<T> od(T vrednost) {
        return new OpcionaVrednost<>(Objects.requireNonNull(vrednost));
    }

    public static <T> OpcionaVrednost<T> odMozdaPostojece(T vrednost) {
        return vrednost == null ? prazan() : od(vrednost);
    }
    
    public T getVrednost() {
        if (vrednost == null) {
            throw new NoSuchElementException("nema vrednosti!");
        }
        return vrednost;
    }
    
    public boolean postoji() {
        return vrednost != null;
    }

    @Override
    public String toString() {
        return postoji() ? "{ }" : "{ " + vrednost + " }";
    }
}
