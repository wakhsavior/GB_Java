package tasks.Seminar_04;

import java.rmi.dgc.Lease;
import java.util.*;

/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

 */
public class Task03 {
    public static void printStack(int[] array ) {
        int length  = array.length;
        Stack<Integer> arrayStack = new Stack<>();
        Queue<Integer> arrayQue = new LinkedList<>();
        Deque<Integer> arrayDeque = new LinkedList<>();
        Queue<Integer> otherQue = new LinkedList<>();


        for (int i = 0; i < length; i++) {
            arrayStack.push(array[i]);
            arrayQue.add(array[i]);
            arrayDeque.push(array[i]);
        }
        otherQue.addAll(arrayStack);
        System.out.println(arrayStack);
        System.out.println(arrayQue);
        System.out.println(arrayDeque);
        System.out.println(otherQue);

        for (int i = 0; i < length; i++) {
            System.out.println(arrayStack.pop());
        }

    }
}
