package stek;

import java.util.Optional;

public class StekPrekoListe<T> implements Stek<T> {
    private class Cvor<G> {
        G vrednost;
        Cvor<G> sledeci;

        Cvor(G vrednost) {
            this.vrednost = vrednost;
        }

        @Override
        public String toString() {
            return " " + vrednost + " ";
        }
    }
    
    private Cvor<T> glava;
    
    // koji konstruktor koristimo?

    @Override
    public void push(T element) {
        Cvor<T> pom = new Cvor<>(element);
        pom.sledeci = glava;
        glava = pom;
    }

    @Override
    public Optional<T> pop() {
        if (empty()) {
            return Optional.empty();
        } else {
            Cvor<T> pom = glava;
            glava = glava.sledeci;
            return Optional.of(pom.vrednost);
        }
    }

	@Override
    public boolean empty() {
        return glava == null;
    }

    @Override
    public Optional<T> top() {
        if (empty()) {
            return Optional.empty();
        } else {
            return Optional.of(glava.vrednost);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("{");
        Cvor<T> iterator = glava;
        while (iterator != null) {
            sb.append(iterator);
            iterator = iterator.sledeci;
        }
        sb.append("}");

        return sb.toString();
    }
}
