package tasks.Seminar_03_HW;

import java.util.ArrayList;

public class Task03 {
    public static int calcMinList(ArrayList<Integer> myList) {
        int min = Integer.MAX_VALUE;
        int lenght = myList.size();
        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i) < min){
                min = myList.get(i);
            }
        }
        return min;
    }

    public static int calcMaxList(ArrayList<Integer> myList) {
        int max = Integer.MIN_VALUE;
        int lenght = myList.size();
        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i) > max){
                max = myList.get(i);
            }
        }
        return max;
    }
    public static float calcAveList(ArrayList<Integer> myList) {
        int summ = 0;
        int lenght = myList.size();
        for (int i = 0; i < myList.size(); i++) {
            summ = summ + myList.get(i);
        }
        return ((float)summ)/lenght;
    }
}
