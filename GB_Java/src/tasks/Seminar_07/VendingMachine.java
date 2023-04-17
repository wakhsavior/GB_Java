package tasks.Seminar_07;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> product) {
        this.products = product;
    }

    public static void buyProduct (Product product){
        if (product != null){
            System.out.println("Вы купили: ");
            System.out.println(product.displayInfo());
        }
        else{
            System.out.println("Такого товара в автомате нет");
        }
    }
    public Product getProduct(String brand, String name, double price) {
        for (Product product : products) {
            if (product.name.equals(name) && product.getBrand() == brand && product.getPrice() == price)
                return product;
        }

        return null;
    }

}
