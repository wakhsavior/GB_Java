package tasks.Test;

public interface Runnable {
    default void run() {
        System.out.println("Run");
    }
}
