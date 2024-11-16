package cas06.zadatak02;

/**
 * This interface represents a FIFO data structure that allows elements to be inserted at the end and removed from the beginning.
 *
 */
public interface Queue {
    /**
     * Method that inserts an element at the end of the queue.
     * @param element element to be inserted.
     */
    void add(int element);

    /**
     * Method that removes the element from the beginning of the queue if it exists.
     */
    void remove();

    /**
     * Method that returns the element at the end of the queue if it exists.
     * @return element at the end of the queue.
     */
    int back();

    /**
     * Method that returns the element from the beginning of the queue if it exists.
     * @return element from the beginning of the queue.
     */
    int head();

    /**
     * Method that returns the number of elements in the queue.
     * @return number of elements in the queue.
     */
    int size();

    /**
     * Method that displays all elements in the queue.
     */
    void show();
}
