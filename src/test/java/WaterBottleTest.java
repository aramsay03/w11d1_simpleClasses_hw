import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    @Test
    public void checkWaterVolume() {
        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void takeADrinkOf10Units() {
        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(90, waterBottle.takeADrink());
    }
}
