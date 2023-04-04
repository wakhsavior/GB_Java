package tasks.Seminar_04_HW;

import java.util.*;

/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

 */
public class Task01 {
    public static LinkedList<Integer> revert(LinkedList<Integer> linkList) {
        Collections.reverse(linkList);
        return linkList;
    }

}
