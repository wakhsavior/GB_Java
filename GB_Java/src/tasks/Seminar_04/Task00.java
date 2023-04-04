package tasks.Seminar_04;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task00 {
    private static int LENGTH = 1000000;

    public static void getTime(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>();
        LinkedList<Integer> intLinkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < LENGTH; i++) {
            intArrayList.add(i);
        }

        long endTime = System.currentTimeMillis();

        double result = (endTime - startTime);

        System.out.printf("Run time for ArrayList: %s %s %n", result, "ms");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < LENGTH; i++) {
            intLinkedList.add(i);
        }
//        long endTime2 = System.currentTimeMillis;

    }

}
