package tasks.Seminar_04;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        Task00.getTime();
//        Task02.scan();
//        int N = tasks.UseFullMethods.requestInt();
//        int[] array = tasks.UseFullMethods.createArray(N);
//        tasks.UseFullMethods.showArray(array);
//        tasks.Seminar_04.Task03.printStack(array);

        GbStack ourStack = new GbStack();
        for (int i = 0; i < 20; i++) {
            ourStack.push(i * 2);
            System.out.println("Size - " + ourStack.size());
            System.out.println("Stack Capacity - " + ourStack.getCapacity());
        }

        int lengthSize = ourStack.size();

        for (int i = 0 ; i < lengthSize; i++) {
            System.out.println(ourStack.pop());
        }

    }
}
