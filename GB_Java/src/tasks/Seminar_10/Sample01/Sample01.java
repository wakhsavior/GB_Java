package tasks.Seminar_10.Sample01;

import java.util.Arrays;

public class Sample01 {
    public static void main(String[] args) {
        SimpleAccount simpleAccount1 = new SimpleAccount(3001, 10500);
        int simpleAccount1Id = simpleAccount1.getId();
        System.out.println(simpleAccount1);
        UniversalAccount universalAccount1 = new UniversalAccount("AABBAA11", 1001.5);
        System.out.println(universalAccount1);
        UniversalAccount universalAccount2 = new UniversalAccount(5001, 1001.5);
        System.out.println(universalAccount2);
        UniversalAccount universalAccount3 =
                new UniversalAccount(new CustomAccountIdentifier(111, "AAA"), 10100.5);
        System.out.println(universalAccount3);
//        CustomAccountIdentifier customId = (CustomAccountIdentifier) universalAccount2.getId();

        Account<CustomAccountIdentifier> account1 =
                new Account<>(new CustomAccountIdentifier(111, "AAA"), 101000);   // тип переменной составной Account CustomAccount
        Account<String> account2 =
                new Account<>("AABB111AA", 101000);
        Account<Integer> account3 =
                new Account<>(5003, 102000);
        CustomAccountIdentifier accountId1 = account1.getId();
        Integer[] array1 = {1, 2, 4, 2, 34, -2, 43, -34, -2, 3, 234, -4, 45};
        String[] array2 = {"AAA", "BBB", "AAB", "BBA", "CCC", "DDD"};
        Object[] newArray = ArrayUtils.replaceTwoElements(array1, 1, 2);
        Integer[] newArray2 = (Integer[]) ArrayUtils.replaceTwoElements(array1, 1, 2);
        ArrayUtils.replaceTwoElementsV2(array2, 2, 3);
        ArrayUtils.<Integer>sample(); // Тут надо указывать с каким типом работаем, так как параметров в примере нет
        String[] newArray3 = ArrayUtils.replaceTwoElementsV2(array2, 3, 4);
        System.out.println(Arrays.toString(newArray3));
    }
}

class ArrayUtils {
    public static Object[] replaceTwoElements(Object[] array, int index1, int index2) {
        Object[] newArrray = array.clone();
        if (index1 >= newArrray.length || index2 >= newArrray.length || index1 < 0 || index2 < 0) {
            return null;
        }
        Object obj = newArrray[index1];
        newArrray[index1] = newArrray[index2];
        newArrray[index2] = obj;
        return newArrray;
    }

    public static <T> T[] replaceTwoElementsV2(T[] array, int index1, int index2) {
        T[] newArrray = array.clone();
        if (index1 >= newArrray.length || index2 >= newArrray.length || index1 < 0 || index2 < 0) {
            return null;
        }
        T obj = newArrray[index1];
        newArrray[index1] = newArrray[index2];
        newArrray[index2] = obj;
        return newArrray;
    }

    public static <T> T sample() {   // Нет параметров, не по чему определить тип обобщения
        return null;
    }

}


class Account<T> {    // T - универсальный параметр, который в дальнейшем будет заменен на какой-то тип данных
    private final T id;
    private double amount;

    public Account(T id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public T getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Сумма на счете #%s : %.2f руб", id, amount);
    }
}

class UniversalAccount {
    private final Object id;
    private double amount;

    public UniversalAccount(Object id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public Object getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Сумма на счете #%s : %.2f руб", id, amount);
    }
}

class CustomAccountIdentifier {
    private int id;
    private String prefix;

    public int getId() {
        return id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public CustomAccountIdentifier(int id, String prefix) {
        this.id = id;
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "CustomAccountIdentifier{" +
                "id=" + id +
                ", prefix='" + prefix + '\'' +
                '}';
    }
}

class SimpleAccount {
    private final int id;
    private double amount;

    public SimpleAccount(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Сумма на счете #%s : %.2f руб", id, amount);
    }
}