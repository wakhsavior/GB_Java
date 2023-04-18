package tasks.Seminar_08;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", "Серый");
        cat1.voice();
        cat1.jump(); // Метод был переопределен в дочернем классе
        ((Animal)cat1).jump();
        System.out.printf("Имя живоного: %s\n", cat1.getName()); // определен на уровне класса Animal

        Animal cat2 = new Cat("персик", "рыжий");
        cat2.voice();
        cat2.jump();
        ((Cat)cat2).jump();
        System.out.printf("Имя живоного: %s\n", cat2.getName());
        System.out.printf("Цвет живоного: %s\n", ((Cat) cat2).getColor());  // В Animal нет такого метода,
        // Чтобы применить этот метод, нужен downCasting
        // Не является бесполезным преобразование и не делается автоматически

        Dog dog1 = new Dog("Шарик", 9);
        dog1.voice();
        dog1.jump();
        System.out.printf("Имя живоного: %s\n", ((Animal) dog1).getName());  // Upcasting явно делать не нужно,
        // происходит неявно из-за того, что родитель один
        // такие преобразования безопасные и автоматические

        Animal dog2 = new Dog("Бублик", 5);
        if (dog2 instanceof Cat) {
            System.out.printf("Цвет живоного: %s\n", ((Cat) dog2).getColor());  // Неправильное преобразование, Exception
                                                // Можно проводить проверку на тип данных
        }

        CatV2 catV2_1 = new CatV2();
        CatV2 catV2_2 = new CatV2();
        DogV2 dogV2_1 = new DogV2();
        DogV2 dogV2_2 = new DogV2();
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Object[] animals = new Object[] {catV2_1,catV2_2,dogV2_1,dogV2_2,bird2,bird1}; // Слишком общий класс

        for (Object animal: animals
             ) {
            if (animal instanceof Flyable){
                ((Flyable)animal).fly(100);
            }
        }
    }
}

interface Runable {
    void run(int distance);
    void swim(int disctance);
}

interface Flyable{
    void fly(int distance);
}
class CatV2 implements Runable {

    @Override
    public void run(int distance) {

    }

    @Override
    public void swim(int disctance) {

    }
}

class DogV2 implements Runable {

    @Override
    public void run(int distance) {

    }

    @Override
    public void swim(int disctance) {

    }
}

class Bird  implements Runable, Flyable {

    @Override
    public void run(int distance) {

    }

    @Override
    public void swim(int disctance) {

    }

    @Override
    public void fly(int distance) {
        System.out.println("Птичка полетела.");
    }
}

abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println("Животное прыгает.");
    }

    public abstract void voice();
}


class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void jump() {
        System.out.println("Котик прыгает.");
    }

//    @Override
//    public String getName() {
//        return super.getName();
//    }

    @Override
    public void voice() {
        System.out.println("Котик мяукает.");

    }
}

class Dog extends Animal {
    private int weight;

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void jump() {
        System.out.println("Песик прыгает.");
    }

//    @Override
//    public String getName() {
//        return super.getName();
//    }

    @Override
    public void voice() {
        System.out.println("Песик гафкает.");

    }
}
