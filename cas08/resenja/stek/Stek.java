package stek;

import java.util.Optional;

public interface Stek<T> {
    void push(T element);
    
    Optional<T> pop();

	// ili peek
    Optional<T> top();
    
    boolean empty();
}
