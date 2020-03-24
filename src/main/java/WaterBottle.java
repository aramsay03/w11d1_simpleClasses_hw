public class WaterBottle {

    private static int volume;
//    private int volume;

    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public static void emptyBottle() {
        if (volume > 0) {
            volume = 0;
        }

    }

    public static void fillBottle() {
        if (volume < 100) {
            volume = 100;
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public int takeADrink() {
        return this.volume - 10;
    }
}
