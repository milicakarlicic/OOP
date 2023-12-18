package primer03;

import java.util.Arrays;

public class Stek {
    // elementi steka
    int[] elementi;
    // prva slobodna pozicija u nizu koji cuva elemente steka
    int vrhSteka;

    public Stek() {
        // inicijalno pravimo niz duzine 2, prva slobodna pozicija
        // je 0 jer nismo ubacili nijedan element
        elementi = new int[2];
        vrhSteka = 0;
    }

    public void push(int x) {
        if (vrhSteka == elementi.length) {
            // ukoliko smo prekoracili trenutnu velicinu steka, uvecavamo duplo
            // niz koji cuva elemente
            elementi = Arrays.copyOf(elementi, 2 * vrhSteka);
        }
        elementi[vrhSteka++] = x;
    }

    public int pop() {
        if (vrhSteka == 0)
            return Integer.MAX_VALUE;
        return elementi[--vrhSteka];
    }

    // metod koji vrati element koji se nalazi na vrhu steka ali ga
    // ne uklanja
    public int top() {
        if (vrhSteka == 0)
            return Integer.MAX_VALUE;
        return elementi[vrhSteka - 1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < vrhSteka; i++) {
            sb.append(elementi[i]);
            sb.append(" ");
        }

        sb.append("| vrh steka je ");
        sb.append(vrhSteka);

        return sb.toString();
    }
}
