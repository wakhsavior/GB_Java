package tasks.Seminar_05_OOP;

public class Animal {
//    private class {} Бессмысленно, недоступен нигде
//    class {}    Доступен только внутри пакета
//    public Animal (){}  По умолчанию создается пуской конструктор, ничего не принимает и не отдает

    //    private String type;  // Переменные класса доступные только в классе
    public String type;
    public String color;   // Переменные класса доступные везде в проекте
    public int legsCount;
    public int age;
    public Owner owner;   // Ссылается на другой созданный класс

    public Animal() {    // Чтобы с разным количество параметров передавать, можно сделать несколько методов
    this.type = "cat";
    this.color = "white";
    this.legsCount = 4;
    this.age = 1;
    }
    public Animal(String type) {
        this.type = type;
        this.color = "white";
        this.legsCount = 4;
        this.age = 1;
    }

    public Animal(String type, String color, int legsCount, int age) {
        this.type = type;
        this.color = color;
        this.legsCount = legsCount;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("Животное Кушает");
    }
}
