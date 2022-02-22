import impl.IMyArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class MyArrayList<E>  implements IMyArrayList<E> {

    private E[] values;
    private Comparator<E> comparator;

    /**
     * Конструктор позволит привести к требуемому типу, который будет передан
     */
    public MyArrayList() {
        values = (E[]) new Object[0];
    }

    /**
     * метод добавления нового элемента в список
     */
    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    /**
     * метод удаления элемента из списка
     */
    @Override
    public boolean delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }
    /**
     * метод получения элемента из списка по индексу
     */
    @Override
    public E get(int index) {
        return values[index];
    }
    /**
     * метод получения размера списка
     */
    @Override
    public int size() {
        return values.length;
    }
    /**
     * метод обновления значения элемента из списка по индексу
     */
    @Override
    public void update(int index, E e) {
        values[index] = e;
    }
    /**
     * метод сортировки элементов
     */
    @Override
    public void sorting() {
        Arrays.sort(values, comparator);
    }
    /**
     * метод очистки списка
     */
    @Override
    public void clear() {
        values = (E[]) new Object[0];
    }
    /**
     * имплементированный метод интерфейса Iterable для работы со списком
     */
    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator<>(values);
    }
}
