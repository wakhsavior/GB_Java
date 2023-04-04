package tasks.Seminar_02_HW;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task01 {
    /*
    Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
     */
    private static final Logger LOG = Log.log(Task01.class.getName());
    public static int[] sortBubble(int[] array) {

        int length = array.length;
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length-i-1; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
                LOG.log(Level.INFO,Arrays.toString(array));

            }
            LOG.log(Level.WARNING,Arrays.toString(array));
//
        }
        return array;
    }
}
