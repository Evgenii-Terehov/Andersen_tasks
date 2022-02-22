import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ArrayListBuilderTest {

    private ArrayListInterface arrayListInterface;

    @BeforeEach
    public void initArray() {
        arrayListInterface = new ArrayListBuilder();
        for (int i = 0; i < 3; i++) {
            arrayListInterface.add(new ListOfObjects("number"));
        }
    }

    private static List<ListOfObjects> listOfObjects = Arrays.asList(
                                            new ListOfObjects("one"),
                                            new ListOfObjects("two"),
                                            new ListOfObjects("three"));

    @Test
    public void givenInputThreeElementsWhenUseMethodSizeThenReturnLengthIsThree(){
        assertEquals(3, arrayListInterface.size());
    }

    @Test
    public void test2(){
        assertEquals(3, arrayListInterface.size());
        ListOfObjects addOneObject = new ListOfObjects("four");
        assertTrue(arrayListInterface.add(addOneObject));
        assertEquals(4, arrayListInterface.size());
    }
//    @Test
//    void shouldSortListByLength() {
//        List<String> inputList = asList("aa", "a", "a3a", "aa333", "ba1", "aa333", "aa33", "Aa3", "aa");
//        List<String> expectedList = asList("a", "aa", "aa", "a3a", "ba1", "Aa3", "aa33", "aa333", "aa333");
//
//        Object testClass = null;
//        List<String> actualString = testClass.getSortedListByLength(inputList);
//
//        Assertions.assertEquals(expectedList, actualString, "Wrong result of method");
//    }
}
