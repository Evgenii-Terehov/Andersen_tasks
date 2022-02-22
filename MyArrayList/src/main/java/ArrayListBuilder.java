import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListBuilder implements ArrayListInterface {

    private static final int SIZE = 9;
    private ListOfObjects[] array;
    private int pointer = 0;

    public ArrayListBuilder(int size) {
        this.array = new ListOfObjects[SIZE];
    }

    public ArrayListBuilder() {
        this.array = new ListOfObjects[SIZE];
    }

    //добавление элемента в список
    @Override
    public boolean add(ListOfObjects item) {
        //при переполнении массива, увеличит размер в 1.5 раза + 1
        if(pointer == array.length - 1) {
            resize((array.length * 3) / 2 + 1);
        }
        array[pointer++] = item;
        return true;
    }

    //возвращает размер списка
    @Override
    public int size() {
        if (array.length == 0) {

        }
        return array.length;
    }

    //удаление элемента списка по индексу
    @Override
    public void remove(int index) {
        if (pointer - index >= 0) {
            System.arraycopy(array, index + 1, array, index, pointer - index);
        }
        array[pointer] = null;
        pointer--;
        resize(array.length - 1);
    }

    //изменение размера массива
    @Override
    public void resize(int newLength) {
        ListOfObjects[] newArray = new ListOfObjects[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    @Override
    public void sorting(Comparator<ListOfObjects> comparator) {
        Arrays.sort(array, 0, SIZE, comparator);
    }

    //возвращает элемент списка по индексу.
    public ListOfObjects getElement(int index) {
        return array[index];
    }

    @Override
    public Iterator<ListOfObjects> iterator() {
        return new Iterator<ListOfObjects>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public ListOfObjects next() {
                return array[index++];
            }
        };
    }
}
