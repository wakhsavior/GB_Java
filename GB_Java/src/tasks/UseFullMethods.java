package tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class UseFullMethods {
    public static int[] createArray(int N) {
        int[] array = new int[N];
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = rnd.nextInt(50);
        }
        return array;
    }

    public static ArrayList<Integer> createList(int N) {
        ArrayList<Integer> array = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            array.add(rnd.nextInt(20));
        }
        return array;
    }

    public static int requestInt() {
        Scanner scn = new Scanner(System.in);
        boolean flag = false;
        int N = 0;
        while (flag == false) {
            System.out.println("Enter number of element in array: ");
            if (scn.hasNextInt() == true) {
                flag = true;
                N = scn.nextInt();
            } else {
                System.out.println("You enter not a digit - " + scn.next());
            }
        }
        return N;
    }

    public static void showArray(int[] array) {
        System.out.print(Arrays.toString(array)+"\n");


    }
}
