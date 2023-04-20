package tasks.Seminar_08_HW;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
       new Cat("Barsik", 5),
        new Cat("Murzik", 15),
        new Cat("Norris", 20),
        new Cat("Vasilek", 10),
        new Cat("Misus", 20)};

        Plate plate = new Plate();
        plate.addFood(35);
        for (Cat cat: cats
             ) {
            cat.eat(plate);
            plate.info();
        }
        for (Cat cat: cats
             ) {
            cat.showCat();
        }
    }
}
