package tasks.Seminar_03_HW;

import java.util.ArrayList;
import java.util.Random;

public class Task05 {
        // Быстрая сортировка Хоара. Использует сравнение слева и справа пока не произойдет обмен и пока не сравняются i и j
       private static int partition (ArrayList<Integer> array, int start, int end)
        {
            int marker = start;
            for ( int i = start; i <= end; i++ )
            {
                if ( array.get(i) <= array.get(end) )
                {
                    int temp = array.get(marker); // swap
                    array.set(marker,array.get(i));
                    array.set(i, temp);
                    marker += 1;
                }
            }
            return marker - 1;
        }

    public static void myQuickSort(ArrayList<Integer> array, int start, int end)
    {
        if ( start >= end )
        {
            return;
        }
        int pivot = partition (array, start, end);
        myQuickSort(array, start, pivot-1);
        myQuickSort(array, pivot+1, end);
    }
    public static void myQuickSort_v2(ArrayList<Integer> array, int start, int end){
        Random rnd = new Random();
        int pivot = (start + end)/2;
        int i = start;
        int j = end;
        do{
            while(array.get(i) < array.get(pivot)){
                i++;
            }
            while(array.get(j) > array.get(pivot)){
                j--;
            }
            if (i <= j){
                if(array.get(i) > array.get(j)){
                    int tmp = array.get(i);
                    array.set(i,array.get(j));
                    array.set(j,tmp);
                    i++;
                    j--;
                }
            }
        }while (i <= j);
        if (i < end){
            myQuickSort_v2(array, i,end);
        }
        if (start < j){
            myQuickSort_v2(array, start,j);
        }

    }
}

