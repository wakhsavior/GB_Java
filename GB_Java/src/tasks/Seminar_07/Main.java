package tasks.Seminar_07;

import tasks.Seminar_06_HW.Laptop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Product product1 = new Product();
//        product1.name = "Вода негазированная";
//        product1.brand = "ООО Источник";
//        product1.price = 35;
//        System.out.println(product1.displayInfo());
//        Product product2 = new Product("Молоко", 120.25);
//        System.out.println(product2.displayInfo());
//        Product product3 = new Product();
//        System.out.println(product3.displayInfo());
//
////        product2.price = -60;
//        System.out.println(product2.displayInfo());
//        Product product4 = new Product("aa", "__", 100);
//        System.out.println(product4.displayInfo());
//        product3.setPrice(10);

        Product bottleOfWater1 = new BottleOfWater("Вода негазированная 1.5 литра", 35, 1.5f);
        bottleOfWater1.setBrand("ООО Святой источник");
        Product bottleOfWater2 = new BottleOfWater("Вода негазированная 2 литра", 45, 2f);
        bottleOfWater2.setBrand("AquaMinerale");
        Product bottleOfWater3 = new BottleOfWater("Вода негазированная 0.5 литра", 25, 0.5f);
        bottleOfWater3.setBrand("ООО Венера");
        Product bottleOfWater4 = new BottleOfWater("Вода газированная 1.5 литра", 40, 1.5f);
        bottleOfWater4.setBrand("ООО Сарова");
        Product bottleOfWater5 = new BottleOfWater("Вода негазированная 5 литра", 120, 5f);
        bottleOfWater5.setBrand("КиБ");
        Product bottleOfWater6 = new BottleOfWater("Вода негазированная 19 литра", 400, 19f);
        bottleOfWater6.setBrand("ООО Саяны");
        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 200, 1f, 3.5f);
        bottleOfMilk1.setBrand("Городецкое молоко");

        Product chocolate1 = new Chocolates("Красный октябрь", "Горький шоколад", 120, 75, 100);
        Product chocolate2 = new Chocolates("Milka", "Молочный шоколад", 140, 55, 120);
        Product chocolate3 = new Chocolates("Старый Дворик", "Вкусный шоколад", 110, 60, 100);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);
        products.add(bottleOfWater6);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);

//        for (Product product: products
//             ) {
//            System.out.println(product.displayInfo());
//        }
        VendingMachine vendingMachine = new VendingMachine(products);
        Product productRes = vendingMachine.getProduct("ООО Венера", "Вода негазированная 0.5 литра", 25);
        VendingMachine.buyProduct(productRes);
        productRes = vendingMachine.getProduct("Milka", "Молочный шоколад", 140);
        VendingMachine.buyProduct(productRes);
        productRes = vendingMachine.getProduct("Старый Дворик", "Молочный шоколад", 120);
        VendingMachine.buyProduct(productRes);
    }
}
