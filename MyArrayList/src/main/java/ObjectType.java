import java.util.Random;

public class ObjectType {
    private String stringItem = "";
    private char charItem;
    private int intItem;


    public ObjectType(String item) {
        this.stringItem = item;
    }

    public ObjectType(char item) {
        this.charItem = item;
    }

    public ObjectType(int item) {
        this.intItem = item;
    }

    public String getStringItem() {
        return stringItem;
    }

    public void setStringItem(String stringItem) {
        this.stringItem = stringItem;
    }

    public char getCharItem() {
        return charItem;
    }

    public void setCharItem(char charItem) {
        this.charItem = charItem;
    }

    public int getIntItem() {
        return intItem;
    }

    public void setIntItem(int intItem) {
        this.intItem = intItem;
    }
}

class QuickSortExample {
    public static int ARRAY_LENGTH = 30;
    private static int[] array = new int[ARRAY_LENGTH];
    private static Random generator = new Random();

    public static void initArray() {
        for (int i=0; i<ARRAY_LENGTH; i++) {
            array[i] = generator.nextInt(100);
        }
    }

    public static void printArray() {
        for (int i=0; i<ARRAY_LENGTH-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH-1]);
    }

    public static void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY_LENGTH - 1;
        doSort(startIndex, endIndex);
    }

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }

    public static void main(String[] args) {
        initArray();
        printArray();
        quickSort();
        printArray();
    }
}