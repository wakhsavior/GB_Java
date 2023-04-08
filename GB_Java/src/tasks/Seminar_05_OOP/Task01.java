package tasks.Seminar_05_OOP;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Task01 {
    private static final Map<Integer, String> passportToName = new HashMap<>();
    Logger logger = Logger.getLogger(Task01.class.getName());
    public static void run(){
        passportToName.put(123456, "Иванов");
        passportToName.put(1223, "Petrov");
        passportToName.put(1234, "Sidorov");
        passportToName.put(12355, "Иванов");
        passportToName.put(1233, "Fedotov");
        passportToName.put(123435, "Иванов");
        passportToName.put(542343, "Иванов");


        System.out.println(passportToName);
        for (Map.Entry<Integer, String> entry : passportToName.entrySet()){
            if (entry.getValue().equals("Иванов")){
                System.out.println(entry);
            }
        }
    }

}
