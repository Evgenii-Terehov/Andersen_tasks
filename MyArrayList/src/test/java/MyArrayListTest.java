import impl.IMyArrayList;
import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MyArrayListTest {

    IMyArrayList<String> myArrayList = new MyArrayList<>();

    @Before
    public void initArray(int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            myArrayList.add("number " + i);
        }
    }

    @Test
    public void givenListWithElementsWhenUseMethodCleanThenListBecameEmpty(){
        initArray(3);
        myArrayList.clear();
        assertEquals(0, myArrayList.size());
    }

    @Test
    public void givenEmptyListWhenAddThreeElementThenReturnLengthIsThree(){
        initArray(3);
        assertEquals(3, myArrayList.size());
        myArrayList.clear();
    }

    @Test
    public void givenListWithThreeElementsWhenUseMethodGetWithIndexOneThenReturnElementByIndex(){
        initArray(3);
        assertEquals("number 1", myArrayList.get(1));
        myArrayList.clear();
    }

    @Test
    public void givenListWithThreeElementsWhenUseMethodUpdateByIndexOneThenReturnUpdatedElementBySameIndex(){
        initArray(3);
        myArrayList.update(1, "new number");
        assertEquals("new number", myArrayList.get(1));
        myArrayList.clear();
    }

    @Test
    public void givenListWithThreeElementsWhenUseMethodDeleteByIndexOneThenReturnUpdatedListWithoutElement(){
        initArray(3);
        int oldSize = myArrayList.size();
        myArrayList.delete(1);
        assertEquals(oldSize - 1, myArrayList.size());
        myArrayList.clear();
    }

    @Test
    public void givenListWithoutSortWhenUseMethodSortingReturnSortList(){
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Three");
        myArrayList.sorting();
        assertEquals("Three", myArrayList.get(1));
        myArrayList.clear();
    }

    @Test
    public void givenListWithTenElementsWhenAddedOneElementReturnTheSizeOfListIsChange(){
        initArray(10);
        assertEquals(10, myArrayList.size());
        myArrayList.add("Some number");
        assertEquals(11, myArrayList.size());
        myArrayList.clear();
    }

    @Test
    void givenEmptyListWhenPutTheTestElementThanNewListContainsTestElement() {
        myArrayList.add("TEST TEXT");
        assertTrue(myArrayList.get(0).contains("TEST TEXT"));
        myArrayList.clear();
    }
}
