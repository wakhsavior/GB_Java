package tasks.Seminar_01;

public class Main {
    public static void main(String[] args) {
        /*
            SEMINAR 01
 */
        tasks.Seminar_01.Task01.run();
        int[] array = new int[]{1,1,0,1,1,1};
        int a = tasks.Seminar_01.Task02.run(array);
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
    }
}
