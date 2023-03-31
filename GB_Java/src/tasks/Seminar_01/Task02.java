package tasks.Seminar_01;

public class Task02 {
    // 1 1 0 1 1 1
    public static int run(int[] array) {
        int max_count = 0;
        int count = 0;
        for (int item : array) {
            if (item == 1) {
                count++;
            } else {
                if (count > max_count) {
                    max_count = count;
                }
                count = 0;
            }
        }
        if (count > max_count) {
            max_count = count;
        }
        return max_count;
    }
}
