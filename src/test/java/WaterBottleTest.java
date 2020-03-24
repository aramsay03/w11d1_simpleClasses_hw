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

    @Test
    public void emptyBottleTest() {
        WaterBottle waterBottle = new WaterBottle(100);
        WaterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }


}
