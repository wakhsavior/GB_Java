package tasks.Seminar_03;

import java.util.*;

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.

 */
public class Task01 {
    public static void sortedArray () {
        List<Integer> listOfNumbers = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i< 10; i++){
            listOfNumbers.add(rnd.nextInt(20));
        }
        System.out.println(listOfNumbers.toString());
        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers.toString());
    }
}
