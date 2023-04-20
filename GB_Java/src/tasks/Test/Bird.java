package tasks.Test;

public class Bird extends BaseAnimal implements Flyable{
    public void dataBird(){
        System.out.printf("Name: %s - Health: %s\n", super.name, super.health);
    }
}
