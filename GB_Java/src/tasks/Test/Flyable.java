package tasks.Test;

public interface Flyable {
    default void fly(){
        System.out.println("Fly");
    }
}
