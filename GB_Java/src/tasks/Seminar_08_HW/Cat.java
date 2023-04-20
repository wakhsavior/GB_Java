package tasks.Seminar_08_HW;

public class Cat {
    private String name;
    private boolean fullness;

    public int getAppetite() {
        return appetite;
    }

    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }
    public void eat(Plate plate) {
        if (plate.takeFood(appetite)){
            this.fullness = true;
        }
    }
    public void showCat(){
        System.out.printf("Кот: %s - аппетит: %s - сытость: %b\n", this.name, this.appetite, this.fullness);

    }
}
