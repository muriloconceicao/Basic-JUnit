import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        int expected = 6;
        int result = calculator.add(2, 4);
        assertEquals(expected, result);
    }

    @Test
    public void addTest2() {
        int expected = 14;
        int result = calculator.add(6, 8);
        assertEquals(expected, result);
    }

    @Test
    public void minusTest() {
        int expected = -2;
        int result = calculator.minus(4, 6);
        assertEquals(expected, result);
    }
}