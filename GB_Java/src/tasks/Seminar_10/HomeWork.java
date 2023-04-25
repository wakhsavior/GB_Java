package tasks.Seminar_10;

import java.util.ArrayList;

public class HomeWork {
    public static void main(String[] args) {
       Box<Apple> box1 = new Box<>();
    }
}

abstract class Fruit {
    private final float weight;

    public double getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}
class Apple extends Fruit{
    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit{
    public Orange() {
        super(1.5f);
    }
}
class Box<T extends Fruit>{
    ArrayList<T> fruits;

    public void addFruits() {

    }
}
