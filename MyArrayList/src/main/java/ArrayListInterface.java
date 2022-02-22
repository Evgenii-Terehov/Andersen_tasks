import java.util.Comparator;

public interface ArrayListInterface<T> extends Iterable<T>{

    boolean add(T item);

    default void remove(int index) {}

    default void resize(int newLength) {}

    int size();

    void sorting(Comparator<T> comparator);
}
