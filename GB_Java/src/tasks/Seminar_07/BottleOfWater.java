package tasks.Seminar_07;

public class BottleOfWater extends Product {
    private float volume;  //объем

    public float getVolume() {
        return volume;
    }

    public BottleOfWater(String name, double price, float volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
//        return super.displayInfo();
        return String.format("%s - %s - %f - объем %.2f", brand, name, price, volume);
    }
}
