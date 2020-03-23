import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void addValues() {
        Calculator calculator = new Calculator(14, 4);
        assertEquals( 18, calculator.add());
    }

    @Test
    public void subtractValues() {
        Calculator calculator = new Calculator(6, 2);
        assertEquals(4, calculator.subtract());
    }

    @Test
    public void multiplyValues() {
        Calculator calculator = new Calculator(3, 5);
        assertEquals(15, calculator.multiply());
    }
}
