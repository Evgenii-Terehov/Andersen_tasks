import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Runner {

    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        ArrayListBuilder[] newArray = new ArrayListBuilder[x.length];

        ArrayListBuilder arrayOfItems;

        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        for(int i = 0; i <= x.length; i++) {
            newArray[i].add(x[i]);
        }

        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
}
