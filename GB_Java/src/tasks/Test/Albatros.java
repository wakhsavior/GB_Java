package tasks.Test;

public class Albatros extends BaseAnimal implements Flyable,Runnable{
    public void dataAlbatros(){
        System.out.printf("Name: %s - Health: %s\n", super.name, super.health);
    }
}
