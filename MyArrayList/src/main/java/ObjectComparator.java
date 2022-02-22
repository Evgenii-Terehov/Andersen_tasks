import java.util.Comparator;

public class ObjectComparator implements Comparator<ListOfObjects>{

    @Override
    public int compare(ListOfObjects o1, ListOfObjects o2) {
        return o1.getObject().compareTo(o2.getObject());
    }
}
