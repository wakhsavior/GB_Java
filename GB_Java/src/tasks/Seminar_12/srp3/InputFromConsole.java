package tasks.Seminar_12.srp3;

import java.util.Scanner;

public class InputFromConsole implements Input{
    private void inputFromConsole(Order order){
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    @Override
    public void input(Order order) {
        inputFromConsole(order);

    }
}
