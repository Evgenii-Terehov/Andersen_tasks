
public class ArrayListBuilder implements Comparable<ArrayListBuilder> {

    private static final int SIZE = 9;
    private ArrayListBuilder[] array = new ArrayListBuilder[SIZE];
    private int pointer = 0;

    //добавление элемента в список
    public void add(ArrayListBuilder item) {
        //при переполнении массива, увеличит размер в 1.5 раза + 1
        if(pointer == array.length - 1) {
            resize((array.length * 3) / 2 + 1);
        }
        array[pointer++] = item;
    }

    //удаление элемента списка по индексу
    public void remove(int index) {
        if (pointer - index >= 0) {
            System.arraycopy(array, index + 1, array, index, pointer - index);
        }
        array[pointer] = null;
        pointer--;
        resize(array.length - 1);
    }

    //изменение размера массива
    private void resize(int newLength) {
        ArrayListBuilder[] newArray = new ArrayListBuilder[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public void quickSort(ArrayListBuilder[] array, int low, int high) {
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        ArrayListBuilder focus = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента array[i] < focus
        int i = low, j = high;
        while (i <= j) {
            if (array[i].compareTo(focus) > 0) {
                i++;
            }

            while (array[j].compareTo(focus) <= 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                ArrayListBuilder temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    //возвращает элемент списка по индексу.
    public ArrayListBuilder get(int index) {
        return array[index];
    }

    @Override
    public int compareTo(ArrayListBuilder o) {
        return 0;
    }
}
