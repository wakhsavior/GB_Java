package tasks.Test;

public class Cat extends BaseAnimal implements Runnable{
    public void dataCat(){
        System.out.printf("Name: %s - Health: %s\n", super.name, super.health);
    }
}
