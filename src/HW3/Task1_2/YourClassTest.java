package HW3.Task1_2;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YourClassTest {
    @ParameterizedTest
    @ValueSource(ints = {4, 0, -6})
    public void testEvenNumber(int number) {
        YourClass yourObject = new YourClass();
        boolean result = yourObject.isEvenOrOddNumber(number);
        assertTrue(result, number + " должно считаться четным.");
    }

    @ParameterizedTest
    @ValueSource(ints = {7, -3})
    public void testOddNumber(int number) {
        YourClass yourObject = new YourClass();
        boolean result = yourObject.isEvenOrOddNumber(number);
        assertFalse(result, number + " должно считаться нечетным.");
    }

    @ParameterizedTest
    @ValueSource(ints = {50, 75, 99})
    public void testNumberInIntervalWithinBounds(int number) {
        YourClass yourObject = new YourClass();
        boolean result = yourObject.numberInInterval(number);
        assertTrue(result, "Число " + number + " должно попадать в интервал (25;100).");
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 24, 101})
    public void testNumberInIntervalOutsideBounds(int number) {
        YourClass yourObject = new YourClass();
        boolean result = yourObject.numberInInterval(number);
        assertFalse(result, "Число " + number + " не должно попадать в интервал (25;100).");
    }
}
