package primer03;

import java.util.Arrays;

public class Stek {
    // elementi steka
    private int[] elementi;
    // prva slobodna pozicija u nizu koji cuva elemente steka
    private int vrhSteka;
    private int kapacitet;

    public Stek() {
        // inicijalno pravimo niz duzine 2, prva slobodna pozicija
        // je 0 jer nismo ubacili nijedan element
        kapacitet = 2;
        elementi = new int[kapacitet];
        vrhSteka = 0;
    }

    public void push(int x) {
        if (vrhSteka == kapacitet) {
            // ukoliko smo prekoracili trenutnu velicinu steka, uvecavamo duplo
            // niz koji cuva elemente
            kapacitet *= 2;
            elementi = Arrays.copyOf(elementi, kapacitet);
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

    public String toString() {
        StringBuilder sb = new StringBuilder();

		sb.append("[ ");
        for (int i = 0; i < vrhSteka; i++) {
            sb.append(elementi[i]).append(" ");
        }
        sb.append("]");

        return sb.toString();
    }
}
