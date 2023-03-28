import tasks.Seminar_01.*;

public class Main {
    public static void main(String[] args) {
        Task1.run();
        int[] array = new int[]{1,1,0,1,1,1};
        int a = Task2.run(array);
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        int n = Task3.nTriangle(100);
        int fact = Task3.nFactorial(15);
        System.out.println(fact);
        Task3.primeNumber(1000);
        Task4.run();

    }
}