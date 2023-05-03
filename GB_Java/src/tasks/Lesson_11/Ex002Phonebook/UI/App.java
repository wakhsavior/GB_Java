package tasks.Lesson_11.Ex002Phonebook.UI;

import java.util.Scanner;

import tasks.Lesson_11.Ex002Phonebook.Config;
import tasks.Lesson_11.Ex002Phonebook.Core.MVP.Presenter;
import tasks.Lesson_11.Ex002Phonebook.Core.MVP.View;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        View view = new NewConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {
            boolean continueProgram = true;
            while (continueProgram) {
                System.out.println(" 1 - prev\n 2 - next\n f - choose contact\n c - create new\n d - remove\n u - update\n s - save to file\n x - exit");

                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case "f":
                        presenter.setContact();
                        break;
                    case "c":
                        presenter.add();
                        break;
                    case "d":
                        presenter.remove();
                        break;
                    case "u":
                        presenter.update();
                        break;
                    case "s":
                        presenter.saveToFile();
                        break;
                    case "x":
                        continueProgram = false;
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
