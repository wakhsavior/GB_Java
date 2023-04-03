package tasks.Seminar_03_HW;

import java.util.ArrayList;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        /*    SEMINAR 03 HOMEWORK

         */
        // TASK 01  Реализовать алгоритм сортировки слиянием
//        int N = tasks.UseFullMethods.requestInt();
//        int[] array = tasks.UseFullMethods.createArray(N);
//        tasks.UseFullMethods.showArray(array);
//        int[] sortArray = Task01.sortMerge(array);
//        tasks.UseFullMethods.showArray(sortArray);

        // TASK 02 Пусть дан произвольный список целых чисел, удалить из него чётные числа
//        int N = tasks.UseFullMethods.requestInt();
//        ArrayList list_01 = tasks.UseFullMethods.createList(N);
//        System.out.println(list_01.toString());
//        System.out.println(Task02.deleteEven(list_01).toString());

        //TASK 03 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
//        int N = tasks.UseFullMethods.requestInt();
//        ArrayList list_01 = tasks.UseFullMethods.createList(N);
//        System.out.println(list_01.toString());
//        System.out.println("Max number in the List: " + Task03.calcMaxList(list_01));
//        System.out.println("Min number in the List: " + Task03.calcMinList(list_01));
//        System.out.printf("Average number in the List: %.2f",Task03.calcAveList(list_01));

        // TASK 04 Реализовать разность массивов и симметрическую разность.
//        int N1 = tasks.UseFullMethods.requestInt();
//        int N2 = tasks.UseFullMethods.requestInt();
//        ArrayList list_01 = tasks.UseFullMethods.createList(N1);
//        ArrayList list_02 = tasks.UseFullMethods.createList(N2);
//
//        System.out.println(list_01.toString());
//        System.out.println(list_02.toString());
//        System.out.println("Symmetric Difference Array is :");
//        System.out.println(Task04.symmetricDiffArray(list_01,list_02).toString());
//        System.out.println("Difference ArrayA and ArrayB is :");
//        System.out.println(Task04.diffArray(list_01,list_02).toString());
//        System.out.println("Difference ArrayB and ArrayA is :");
//        System.out.println(Task04.diffArray(list_02,list_01).toString());

        // TASK 05 Релизовать быструю сортировку с рандомным выбором Pivot
        int N = tasks.UseFullMethods.requestInt();
        ArrayList list_01 = tasks.UseFullMethods.createList(N);
        System.out.println(list_01.toString());
        Task05.myQuickSort_v2(list_01, 0, N-1);
        System.out.println(list_01.toString());

    }
}
