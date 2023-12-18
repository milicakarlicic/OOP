package primer04;

public class RedPrekoNiza implements Red {
    private final int[] elementi;
    private final int kapacitet;
    private int pocetak;
    private int kraj;
    private int brojElemenata;

    public RedPrekoNiza(int kapacitet) {
        this.kapacitet = kapacitet;
        this.elementi = new int[kapacitet];
        this.pocetak = 0;
        this.kraj = 0;
        this.brojElemenata = 0;
    }

    @Override
    public void add(int x) {
        if (kapacitet == size()) {
            System.err.println("prekoracenje");
            return;
        }

        elementi[kraj] = x;
        kraj = (kraj + 1) % kapacitet;
        brojElemenata++;
    }

    @Override
    public void remove() {
        if (size() == 0) {
            System.err.println("potkoracenje");
            return;
        }

        pocetak = (pocetak + 1) % kapacitet;
        brojElemenata--;
    }

    @Override
    public int head() {
        if (size() == 0) {
            System.err.println("potkoracenje");
            return Integer.MIN_VALUE;
        }

        return elementi[pocetak];
    }

    @Override
    public int back() {
        if (size() == 0) {
            System.err.println("potkoracenje");
            return Integer.MIN_VALUE;
        }

        return elementi[(kraj - 1) % kapacitet];
    }

    @Override
    public int size() {
        return brojElemenata;
    }

    @Override
    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[ ");
        for (int i = 0; i < size(); i++) {
            sb.append(elementi[(i + pocetak) % kapacitet]).append(" ");
        }
        sb.append("]");

        return sb.toString();
    }
}
