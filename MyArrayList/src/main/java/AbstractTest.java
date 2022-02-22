import org.junit.jupiter.api.BeforeEach;

abstract class AbstractTest {

    ArrayListInterface testClass;

    @BeforeEach
    void setUp() {
        testClass = new ArrayListBuilder();
    }
}
