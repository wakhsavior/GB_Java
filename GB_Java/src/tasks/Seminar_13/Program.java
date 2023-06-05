package tasks.Seminar_13;

import tasks.Seminar_13.singleton.Settings;

public class Program {
    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println(settings1);
        System.out.println(settings2);



    }
}
