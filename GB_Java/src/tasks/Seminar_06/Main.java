package tasks.Seminar_06;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Owner sergey = new Owner("Sergey Vasilyev", "+79101231230");
        Owner marina = new Owner("Marina Alexeeva", "+79103213211");
        Cat barsyk = new Cat("Barsyk", 2, true,"Prostuda", sergey);
        Cat cat1 = new Cat("Norris",2,false,"",marina);
        Cat cat2 = new Cat("Norris",2,false,"",marina);
        Cat cat3 = new Cat("Pumba",2,false,"",marina);
        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);
    }

}
