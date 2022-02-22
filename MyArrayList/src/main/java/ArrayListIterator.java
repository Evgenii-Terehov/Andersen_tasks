import java.util.Iterator;

/**
 * Описание класса ArrayListIterator:
 * создан для итерации по элементам переданного списка
 */

public class ArrayListIterator<E> implements Iterator<E> {

    private E[] values;

    ArrayListIterator(E[] values) {
        this.values = values;
    }

    /**
     * имплементированный метод интерфейса Iterator для
     * проверки наличия следующего элемента в списке
     */
    @Override
    public boolean hasNext() {
        return false;
    }

    /**
     * имплементированный метод интерфейса Iterator для
     * перехода на следующий элемент в списке
     */
    @Override
    public E next() {
        return null;
    }
}
