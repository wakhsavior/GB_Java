package tasks.Seminar_02_HW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        // TASK 01
//        int N = tasks.UseFullMethods.requestInt();
//        int[] array = tasks.UseFullMethods.createArray(N);
//        tasks.UseFullMethods.showArray(array);
//        int[] sortArray = tasks.Seminar_02_HW.Task01.sortBubble(array);
//        tasks.UseFullMethods.showArray(sortArray);

        //TASK 02
        File jsonFile = new File("src/tasks/Seminar_02_HW/students.json");
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile))){
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                    ArrayList studentList = tasks.Seminar_02_HW.Task02.parseJson(line);
                    tasks.Seminar_02_HW.Task02.showPerform(studentList);
            }
        }
        catch (Exception e){
            System.out.println("Problem with file" + e.toString());

        }
        finally {
            System.out.println("Finally");
        }
    }
}
