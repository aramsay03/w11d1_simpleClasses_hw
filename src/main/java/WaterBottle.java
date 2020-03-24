public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public int takeADrink() {
        return this.volume - 10;
    }
}
