package tasks.Seminar_07;

public class Chocolates extends Product{
    private int cacaoPercent;  // % содержание какао
    private int weight; // Вес шоколадки

    public Chocolates (String brand, String name, double price, int cacaoPercent, int weight){
        super(brand, name, price);
        if (cacaoPercent <= 0 || cacaoPercent > 100){
            this.cacaoPercent = 50;
        }
        else this.cacaoPercent = cacaoPercent;
        if (weight <= 0 || weight > 2000){
            this.weight = 100;
        }
        else this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %f - масса %d - какао %d%%", brand, name, price, weight, cacaoPercent);
    }
}
