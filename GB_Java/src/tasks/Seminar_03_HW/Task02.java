package tasks.Seminar_03_HW;

import java.util.ArrayList;

public class Task02 {
    public static ArrayList<Integer> deleteEven(ArrayList<Integer> myList) {

        for (int i = 0; i < myList.size(); i++) {
            if(((myList.get(i))%2) == 0){
                myList.remove(i);
                i--;
            }
        }
        return myList;
    }
}
