package tasks.Seminar_12.srp3;

import tasks.Seminar_12.srp3.Order;

import java.util.ArrayList;

public class Program {


    /**
     * Оптимизированная по принципам SOLID домашняя работа
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Укажите заказ:");
        Order order = new Order();
        Input inputFromConsole = new InputFromConsole();
        ArrayList<Save> saves = new ArrayList<>();
        saves.add(new SaveToJson());
        saves.add(new SaveToConsole());
        inputFromConsole.input(order);
        for (Save save:saves) {
            save.save(order);
        }

    }

}
