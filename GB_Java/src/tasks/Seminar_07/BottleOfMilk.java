package tasks.Seminar_07;

public class BottleOfMilk extends Product{
    private float volume;  //объем
    private float fat; // жирность

    public float getVolume() {
        return volume;
    }


    public BottleOfMilk(String name, double price, float volume, float fat) {
        super(name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
//        return super.displayInfo();
        return String.format("%s - %s - %f - объем %.2f, жирность - %.1f%%", brand, name, price, volume, fat);
    }

}
