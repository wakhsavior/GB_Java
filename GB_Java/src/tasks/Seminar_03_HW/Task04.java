package tasks.Seminar_03_HW;

import java.util.ArrayList;

/*
Реализовать разность массивов и симметрическую разность.
 */
public class Task04 {
    public static ArrayList<Integer> symmetricDiffArray(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        int arrayALength = arrayA.size();
        int arrayBLength = arrayB.size();
        for (int i = 0; i < arrayALength; i++) {
            boolean flagPresence = false;
            int j = 0;
            while ((flagPresence == false) && (j != arrayBLength)) {
                if (arrayA.get(i) == arrayB.get(j)) {
                    flagPresence = true;
                    arrayA.remove(i);
                    arrayB.remove(j);
                    arrayBLength = arrayBLength - 1;
                    arrayALength = arrayALength - 1;
                    i--;
                }
                j++;
            }
        }
        resultArray.addAll(arrayA);
        resultArray.addAll(arrayB);
        return resultArray;
    }

    public static ArrayList<Integer> diffArray(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        int arrayALength = arrayA.size();
        int arrayBLength = arrayB.size();
        for (int i = 0; i < arrayALength; i++) {
            boolean flagPresence = false;
            int j = 0;
            while ((flagPresence == false) && (j != arrayBLength)) {
                if (arrayA.get(i) == arrayB.get(j)) {
                    arrayA.remove(i);
                    i--;
                }
                j++;
            }
        }
    return arrayA;
    }
}
