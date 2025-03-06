package example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setup() {
        calculator = new Calculator();
    }
    @Test
    public void testAddBasic() {
        Assert.assertEquals(4, calculator.add(1, 3));
    }
    @Test
    public void testAddZeros() { Assert.assertEquals(0, calculator.add(0, 0)); }
    @Test
    public void testAddNegatives() { Assert.assertEquals(-2, calculator.add(-1, -1)); }
    @Test
    public void testAddPositiveNegative() { Assert.assertEquals(1, calculator.add(2, -1)); }
    @Test
    public void testMinusBasic() {
        Assert.assertEquals(10, calculator.minus(15, 5));
    }
    @Test
    public void testMinusZeros() {
        Assert.assertEquals(0, calculator.minus(0, 0));
    }
    @Test
    public void testMinusNegatives() { Assert.assertEquals(1, calculator.minus(-1, -2)); }
    @Test
    public void testMinusNegativePositive() {
        Assert.assertEquals(-3, calculator.minus(-1, 2));
    }
    @Test
    public void testMultiplyBasic() {
        Assert.assertEquals(10, calculator.multiply(2, 5));
    }
    @Test
    public void testDivideBasic() {
        Assert.assertEquals(5, calculator.divide(10, 2), 0.5);
    }
}
