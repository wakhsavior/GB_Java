package tasks.Seminar_04;

import java.util.*;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.

 */
public class Task02 {

    public static void scan() {
        Deque<String> texts = new ArrayDeque<>();
        Scanner scn = new Scanner(System.in);
        boolean cont =  true;
        while(cont){
            System.out.print("");
            String stg = scn.nextLine();
            if (stg.equalsIgnoreCase("print")){
                System.out.println(texts);
            } else if (stg.equalsIgnoreCase("revert")) {
                System.out.println("Delete->" + texts.pop());
            }else {
                texts.push(stg);
            }

            if (stg.equalsIgnoreCase("exit")){
                System.out.println("EXIT!!!");
                cont = false;
            }
        }
        System.out.println(texts);
        scn.close();

    }
}
