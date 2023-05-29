package tasks.Seminar_12.lsp;

/**
 * Класс S
 */
public class Duck extends Bird{
    @Override
    public void fly() {
        System.out.printf("Утка летит со скоростью %d км/ч\n", 8);
    }
}
