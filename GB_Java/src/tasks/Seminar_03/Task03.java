package tasks.Seminar_03;

import java.util.ArrayList;

/*
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.

 */
public class Task03 {
    public static void delete() {
        ArrayList myList= new ArrayList<String>();
        myList.add("Hello");
        myList.add("Bye");
        myList.add(23);
        myList.add(32);
        myList.add("Hi");
        for (int i = 0;i<myList.size();i++) {
            if (myList.get(i) instanceof Integer) {
                myList.remove(myList.get(i));
                i--;
            }
        }
        System.out.println(myList);

    }
}
