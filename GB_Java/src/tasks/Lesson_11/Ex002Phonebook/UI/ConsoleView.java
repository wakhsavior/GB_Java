package tasks.Lesson_11.Ex002Phonebook.UI;

import java.util.Locale;
import java.util.Scanner;

import tasks.Lesson_11.Ex002Phonebook.Core.MVP.View;

public class ConsoleView implements View {
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }
    @Override
    public String getFirstName() {
        System.out.printf("FirstName: ");
        return in.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("FirstName: %s\n", value);
    }

    @Override
    public String getLastName() {
        System.out.printf("LastName: ");
        return in.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("LastName: %s\n", value);
    }

    @Override
    public String getDescription() {
        System.out.printf("Description: ");
        return in.nextLine();
    }

    @Override
    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);        
    }

    @Override
    public boolean requestYN(String string) {

        while (true) {
            System.out.println(string);
            String answer = in.nextLine().toLowerCase();
            switch (answer){
                case "y":
                    return true;
                case "n":
                    return false;
            }
        }
    }

    @Override
    public void sendMessage(String string) {
        System.out.println(string);
    }

}
