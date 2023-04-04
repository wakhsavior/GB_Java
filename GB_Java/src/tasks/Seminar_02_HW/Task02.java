package tasks.Seminar_02_HW;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task02 {
    /*
    Дана строка json:
    [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
    Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
    Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
    Студент Иванов получил 5 по предмету Математика.
    Студент Петрова получил 4 по предмету Информатика.
    Студент Краснов получил 5 по предмету Физика.
     */

    public static void showPerform(ArrayList<ArrayList<String>> studentList) {
        for (ArrayList<String> student: studentList) {
            System.out.printf("Студент %s получил %s по предмету %s.\n", student.get(0), student.get(1), student.get(2));
        }
    }
    public static ArrayList parseJson(String jsonString) {
        ArrayList students = new ArrayList();

        String[] data = jsonString.split("\\[\\{|}, \\{|\\}\\]");
        for (String line : data) {
            String[] personStr = line.split(",");
            ArrayList<String> personArray = new ArrayList<>();
            for (String item : personStr) {
                String[] personData = item.split(":");
                if (personData.length == 2) {
                    personArray.add(personData[1]);
//                    System.out.println(Arrays.toString(personData));
                }

//                System.out.println(personData[1]);
            }
            if (personArray.size() > 0) {
                students.add(personArray);
            }
        }
        return students;
    }
}
