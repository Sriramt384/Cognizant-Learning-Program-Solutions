package test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up Calculator instance");
    }
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Tearing down Calculator instance");
    }
    @Test
    public void testAddition() {
        // Arrange
        int a = 2;
        int b = 3;
        // Act
        int result = calculator.add(a, b);
        // Assert
        assertEquals(5, result);
    }
    @Test
    public void testMultiplication() {
        // Arrange
        int a = 4;
        int b = 5;
        // Act
        int result = calculator.multiply(a, b);
        // Assert
        assertEquals(20, result);
    }
}
