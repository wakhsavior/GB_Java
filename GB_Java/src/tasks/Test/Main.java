package tasks.Test;

public class Main {
    public static void main(String[] args) {
        Flyable bird1 = new Bird();
        Cat cat1 = new Cat();
        Albatros albatros1 = new Albatros();
        Flyable albatros2 = new Albatros();
        Runnable albatros3 = new Albatros();
        albatros1.fly();
        albatros1.run();
        albatros2.fly();
        albatros2.run();
        albatros3.run();
        albatros3.fly();
    }
}

