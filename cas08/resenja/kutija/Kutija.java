package kutija;

public class Kutija<T> {
    private T element;
    private boolean sadrzi;
    
    public Kutija() {}
    public Kutija(T predmet) {
        this.predmet = predmet;
        this.sadrziPredmet = true;
    }

    public T uzmiIzKutije() throws MojIzuzetak {
        if (!sadrzi) {
            throw new MojIzuzetak("kutija je prazna");
        }
        sadrzi = false;
        return element;
    }

    public void ubaciUKutiju(T element) throws MojIzuzetak {
        if (sadrzi) {
            throw new MojIzuzetak("kutija je puna");
        }
        sadrzi = true;
        this.element = element;
    }

    @Override
    public String toString() {
        return !sadrzi ?  "{ }" : "{ " + element + " }";
    }
}
