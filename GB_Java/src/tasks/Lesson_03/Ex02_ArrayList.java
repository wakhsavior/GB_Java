package tasks.Lesson_03;

import java.util.ArrayList;

public class Ex02_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("sdfis");
        for (Object o : list){
            System.out.println(o);
            Ex01_object.GetType(o);
        }
    }
}
