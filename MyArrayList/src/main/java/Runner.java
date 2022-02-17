import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        ArrayListBuilder<Type> array = new ArrayListBuilder<>();
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };

        for(int obj : x) {
//            array.add();
        }

        System.out.println("Было");
        System.out.println(Arrays.toString(x));

//        quickSort.quickSort(array.setArray(x);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
}
