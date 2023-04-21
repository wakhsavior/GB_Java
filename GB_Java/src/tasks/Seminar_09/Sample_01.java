package tasks.Seminar_09;

public class Sample_01 {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Барсик", 50, 100),
                new Dog("Бобик", 20, 30),
                new Cat("Мурзик", 50, 0),
                new Animal("Рога", 50, 50),
                new Animal("Копыта", 30, 30)
        };
        for (Animal animal : animals) {
            animal.run(20);
            animal.swim(40);
            animal.run(10);
            animal.swim(50);
            animal.run(30);
            animal.swim(70);
        }
        System.out.printf("Кол-во котов %d\n", Cat.getCounter());
        System.out.printf("Кол-во собак %d\n", Dog.getCounter());
        System.out.printf("Кол-во животных %d\n", Animal.getCounter());
    }
}

class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        counter++;  // Инициализатор, будет вызываться перед каждым конструктором
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);

        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, distance);
        }
    }

    public void swim(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s проплыл %d метров\n", name, distance);

        } else {
            System.out.printf("%s не смог проплыть %d метров\n", name, distance);
        }
    }

}

class Cat extends Animal {
    private static int counter; // не переопределяет счетчик класса Animal

    public static int getCounter() {
        return counter;
    }

    {
        counter++;  // Инициализатор, будет вызываться перед каждым конструктором
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать\n", name);
    }

    @Override
    public void run(int distance) {
        if (this.maxRun >= distance) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, distance);
        }

    }
}

class Dog extends Animal {
    private static int counter; // не переопределяет счетчик класса Animal

    public static int getCounter() {
        return counter;
    }

    {
        counter++;  // Инициализатор, будет вызываться перед каждым конструктором
    }

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

    @Override
    public void swim(int distance) {
        if (this.maxSwim >= distance) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог проплыть %d метров\n", name, distance);
        }
    }

    @Override
    public void run(int distance) {
        if (this.maxRun >= distance) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, distance);
        }

    }
}