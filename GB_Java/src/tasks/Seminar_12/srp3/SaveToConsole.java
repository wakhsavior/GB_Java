package tasks.Seminar_12.srp3;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToConsole implements Save {
    private void printToConsole(Order order) {
        System.out.printf("{\n");
        System.out.printf("\"clientName\":\"" + order.getClientName() + "\",\n");
        System.out.printf(("\"product\":\"" + order.getProduct() + "\",\n"));
        System.out.printf(("\"qnt\":" + order.getQnt() + ",\n"));
        System.out.printf(("\"price\":" + order.getPrice() + "\n"));
        System.out.printf(("}\n"));
    }

    @Override
    public void save(Order order) {
        printToConsole(order);
    }
}
