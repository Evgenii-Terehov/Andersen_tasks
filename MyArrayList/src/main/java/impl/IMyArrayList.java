package impl;

/**
 * Описание класса IMyArrayList:
 * интерфейс Iterable принят для упрощения работы с классом MyArrayList, так же
 */

public interface IMyArrayList<E> extends Iterable<E> {

    boolean add(E e);

    boolean delete(int index);

    E get(int index);

    int size();

    void update(int index, E e);

    void sorting();

    void clear();
}
