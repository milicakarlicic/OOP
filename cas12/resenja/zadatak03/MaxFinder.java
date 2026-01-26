package zadatak03;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class MaxFinder<T> implements GenericMax<T> {
    private Comparator<T> comparator;

    public MaxFinder() {
    }

    public MaxFinder(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public Optional<T> findMax(Collection<T> collection, Comparator<T> comparator) {
        Optional<T> rezultat;

        if (collection.isEmpty()) {
            rezultat = Optional.empty();
        } else {
            // drugi nacin: traziti rucno maksimum iterirajuci kroz kolekciju
            T max = Collections.max(collection, comparator);

            rezultat = Optional.of(max);
        }

        return rezultat;
    }

    @Override
    public Optional<T> findMax(Collection<T> collection) {
        if (comparator == null) {
            throw new RuntimeException("Komparator nije definisan");
        }

        return findMax(collection, comparator);
    }
}
