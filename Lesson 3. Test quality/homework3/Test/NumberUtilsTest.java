import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void testEvenNumber() {
        YourClass yourObject = new YourClass();
        boolean result = yourObject.evenOddNumber(4);
        assertTrue(result);
    }

    @Test
    void testOddNumber() {
        YourClass yourObject = new YourClass();
        boolean result = yourObject.evenOddNumber(7);
        assertFalse(result);
    }

    @Test
    void testNumberInInterval() {
        YourClass yourObject = new YourClass();
        boolean result = yourObject.isNumberInInterval(50);
        assertTrue(result);
    }

    @Test
    void testNumberNotInInterval() {
        YourClass yourObject = new YourClass();
        boolean result = yourObject.isNumberInInterval(120);
        assertFalse(result);
    }

    @Test
    void testNumberOnIntervalBoundary() {
        YourClass yourObject = new YourClass();
        boolean result = yourObject.isNumberInInterval(25);
        assertFalse(result);
    }
}
