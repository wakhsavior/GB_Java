package tasks.Seminar_08_HW;

public class Plate {

    private int food;

    public Plate() {
        this.food = 0;
    }

    public void addFood(int food) {
        if ( food >= 0 ){
            this.food = this.food + food;
        }
        else throw new RuntimeException("Вы пытаетесь добавить отрицательное количество еды в тарелку");
    }
    public boolean takeFood(int food){
        if ((this.food - food) >=0){
            this.food = this.food - food;
            return true;
        } else return false;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
