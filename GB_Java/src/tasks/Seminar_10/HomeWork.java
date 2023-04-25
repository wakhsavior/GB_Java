package tasks.Seminar_10;

import java.util.ArrayList;

/**
 * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 * Можно сравнивать коробки с яблоками и апельсинами;
 * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 * g. Не забываем про метод добавления фрукта в коробку.
 */
public class HomeWork {
    public static void main(String[] args) {
        Box<Fruit> box1 = new Box<>("Коробка-1");
        Box<Fruit> box2 = new Box<>("Коробка-2");
        Box<Fruit> box3 = new Box<>("Коробка-3");

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        for (int i = 0; i < 10; i++) {
            box1.addFruits(new Apple());
        }
        for (int i = 0; i < 8; i++) {
            box2.addFruits(new Orange());
        }
        for (int i = 0; i < 2; i++) {
            box3.addFruits(new Apple());
        }
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        box1.moveFruits(box3);

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        System.out.println(box1.compare(box2));
        System.out.println(box2.compare(box3));
    }
}

abstract class Fruit {
    private final float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit {
    public Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        return "Яблоки";
    }
}

class Orange extends Fruit {
    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return "Апельсины";
    }
}

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    private final String name;

    public Box(String name) {
        this.name = name;
    }

    public void addFruits(T fruit) {
        fruits.add(fruit);

    }

    public int fruitsCount() {
        return fruits.size();
    }

    public float getWeight() {
        if (!fruits.isEmpty()) {
            return fruitsCount() * getFruitType().getWeight();
        } else return 0;
    }

    public T getFruit() {
        if (!fruits.isEmpty()) {
            T fruit = fruits.get(0);
            fruits.remove(0);
            return fruit;
        } else {
            System.out.println("Фруктов в корзине нет");
            return null;
        }
    }

    public T getFruitType() {
        if (!fruits.isEmpty()) {
            return fruits.get(1);
        } else {
            return null;
        }
    }

    public boolean compare(Box<T> box) {
        if (this.getWeight() == box.getWeight()) return true;
        else return false;
    }

    public void moveFruits(Box<T> box) {
        if (!fruits.isEmpty()) {
            while (this.fruitsCount() > 0) {
                box.addFruits(this.getFruit());
            }
        } else System.out.println("Фруктов в корзине нет");
    }

    @Override
    public String toString() {
        return String.format("Коробка: %s; фрукты: %s; вес: %.2f", name, getFruitType(), getWeight());
    }


}
