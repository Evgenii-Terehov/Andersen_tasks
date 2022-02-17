public class ArrayListBuilder<Type> {

    private static final int SIZE = 9;
    private Object[] array = new Object[SIZE];
    private int pointer = 0;

    //добавление элемента в список
    public void add(Type item) {
        //при переполнении массива, увеличит размер в 1.5 раза + 1
        if(pointer == array.length - 1) {
            resize((array.length * 3) / 2 + 1);
        }
        array[pointer++] = item;
    }

    //возвращает элемент списка по индексу.
    public Type get(int index) {
        return (Type) array[index];
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
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
