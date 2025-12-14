package cas06.zadatak02;

public class QueueUsingFixedArray implements Queue {
    private final int[] elements;
    private final int capacity;
    private int begin;
    private int end;
    private int numberOfElements;

    public QueueUsingFixedArray() {
        capacity = 4;
        elements = new int[capacity];
        begin = 0;
        end = 0;
        numberOfElements = 0;
    }

    @Override
    public void add(int element) {
        overflow();

        elements[end] = element;
        end = (end + 1) % capacity;
        numberOfElements++;
    }

    @Override
    public void remove() {
        underflow();

        begin = (begin + 1) % capacity;
        numberOfElements--;
    }

    @Override
    public int back() {
        underflow();
        return elements[(capacity + end - 1) % capacity];
    }

    @Override
    public int head() {
        underflow();
        return elements[begin];
    }

    private void underflow() {
        if (size() == 0) {
            System.err.println("Underflow");
            System.exit(1);
        }
    }

    private void overflow() {
        if (size() == capacity) {
            System.err.println("Overflow");
            System.exit(1);
        }
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size(); i++) {
            sb.append(elements[(begin + i) % capacity]).append(" ");
        }

        return sb.toString();
    }
}
