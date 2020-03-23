import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void addValues(){
        Calculator calculator = new Calculator(14, 4);
        assertEquals( 18, calculator.add());
    }
}
