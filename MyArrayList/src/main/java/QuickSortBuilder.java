import java.util.Arrays;

public class QuickSortBuilder {

    private static int partition(Comparable[] arr, int left, int right) {
        Object pivot = arr[left];
        // arr[left+1...j] < pivot ; arr[j+1...i) > pivot
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i].compareTo(pivot) < 0) {
                j++;
                swap(arr, j, i);
            }
        }
        swap(arr, left, j);
        return j;
    }

    // Рекурсивно использовать быструю сортировку для сортировки диапазона arr [l ... r]
    private static void quickSort(Comparable[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = partition(arr, left, right);
        quickSort(arr, left, p - 1);
        quickSort(arr, p + 1, right);
    }

    public void quickSort(Comparable[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

class QuickSort implements Comparable<QuickSort>{

    private static ArrayListBuilder<Type> inputArray = new ArrayListBuilder<>();


    public QuickSort() {

    }


    public static void quickSort(Type[] array, int low, int high) {



        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Type focus = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < focus) {
                i++;
            }

            while (array[j] > focus) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
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
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }

    @Override
    public int compareTo(QuickSort o) {
        return 0;
    }
}
