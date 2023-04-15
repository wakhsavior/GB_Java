package tasks.Seminar_07;

import java.util.SplittableRandom;

public class Product {
    protected String name;
    protected String brand;
    protected double price;

    /**
     * Getter - Accessor
     * @return
     */
    public double getPrice(){
        return price;
    }

    /**
     * Setter - Mutator
     */
    public void setPrice(double price){
        if (price <= 0) throw new RuntimeException(String.format("Некоректная цена товара: %s", price));
        else this.price = price;
    }
    int param1;
    String param2;
    boolean param3;
    String param4;

    /**
     * Инициализатор
     */ {
        System.out.println("Initializer");
        param1 = 100;
        param2 = "...";
        param3 = true;
        param4 = "====";
    }

    /**
     * Пустой конструктор, который может быть перегружен
     */
//    public Product(){
//        name = "Продукт";
//        brand = "Noname";
//        price = 1;
//    }
//    public Product(String inputName){
//        name = inputName;
//    }
//    public Product(String inputName,double inputPrice){
//        name = inputName;
//        price = inputPrice;
//    }
//    public Product(String inputBrand, String inputName, double inputPrice){
//        name = inputName;
//        price = inputPrice;
//        brand = inputBrand;
//
//    }
    public Product(String brand, String name, double price) {
        System.out.println("Constructor");
        if (brand.length() < 3)
            this.brand = "Noname";
        else this.brand = brand;
        if (name.length() < 3) this.name = "Товар";
        else this.name = name;
//        if (price <= 0) this.price = 1;
        if (price <= 0) throw new RuntimeException(String.format("Некоректная цена товара: %s", price));
        else this.price = price;


    }

    public Product(String name, double price) {
        this("Noname", name, price);
    }

    public Product(String name) {
        this(name, 1);
    }

    public Product() {
        this("Продукт");
    }

    /**
     * Получить информацию по продукту
     *
     * @return Информация по продукту
     */
    public String displayInfo() {
        return String.format("%s - %s - %f", brand, name, price);
    }
}
