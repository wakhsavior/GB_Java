package tasks.Seminar_06_HW;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Map<Integer, Laptop> allLaptops= new HashMap<>();
        Set<Laptop> filteredLaptops= new HashSet<>();
        Laptop laptop1 = new Laptop(Brand.LENOVO, Color.GREY);
        Laptop laptop2 = new Laptop(Brand.DELL, Color.BLACK);
        Laptop laptop3 = new Laptop(Brand.HP, Color.GREY);
        Laptop laptop4 = new Laptop(Brand.LENOVO, Color.RED);
        Laptop laptop5 = new Laptop(Brand.DELL, Color.GREY);
        Laptop laptop6 = new Laptop(Brand.ASUS, Color.BLACK);
        Laptop laptop7 = new Laptop(Brand.APPLE, Color.WHITE);
        Laptop laptop8 = new Laptop(Brand.ASER, Color.WHITE);
        Laptop laptop9 = new Laptop(Brand.HP, Color.RED);
        Laptop laptop10 = new Laptop(Brand.LENOVO, Color.RED);
        allLaptops.put(laptop1.hashCode(),laptop1);
        allLaptops.put(laptop2.hashCode(),laptop2);
        allLaptops.put(laptop3.hashCode(),laptop3);
        allLaptops.put(laptop4.hashCode(),laptop4);
        allLaptops.put(laptop5.hashCode(),laptop5);
        allLaptops.put(laptop6.hashCode(),laptop6);
        allLaptops.put(laptop7.hashCode(),laptop7);
        allLaptops.put(laptop8.hashCode(),laptop8);
        allLaptops.put(laptop9.hashCode(),laptop9);
        allLaptops.put(laptop10.hashCode(),laptop10);

        Scanner scn = new Scanner(System.in);
        boolean filterIncorrect = true;
        String filter = "";

        while(filterIncorrect) {
            System.out.println("Enter filter criteria: ");
            filter = scn.nextLine().toUpperCase(Locale.ROOT);
            for (Color color: Color.values()) {
                if(color.toString().equals(filter)){
                    filterIncorrect = false;
                }
            }
            for (Brand brand: Brand.values()) {
                if(brand.toString().equals(filter)){
                    filterIncorrect = false;
                }
            }
        }
        for (Map.Entry<Integer, Laptop> entry: allLaptops.entrySet()) {
            if (entry.getValue().color.toString().equals(filter) || entry.getValue().brand.toString().equals(filter)) {

                filteredLaptops.add(entry.getValue());
            }
        }
        System.out.println(filteredLaptops);
    }
}
