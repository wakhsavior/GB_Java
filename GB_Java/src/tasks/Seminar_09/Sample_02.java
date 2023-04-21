package tasks.Seminar_09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample_02 {
    private static Random rnd = new Random();

    /**
     * TODO 2. Переработать метод generateEmployee(). Метод должен возвращать любого
     * случайного сотрудника разного типа (Worker, Freelancer)
     *
     * @return
     */
    public static Worker generateEmployee() {

        int salary = rnd.nextInt(900, 1500);
        int salaryIndex = rnd.nextInt(28, 31);


        return new Worker(names[rnd.nextInt(10)], surnames[rnd.nextInt(10)], salary * salaryIndex);
    }

    public static void main(String[] args) {
        Worker worker = new Worker("Глеб", "григорьев", 120000);
        System.out.println(worker);
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Arrays.sort(employees, new SalaryComparator());

        System.out.println("\n*** Отсортированный массив ***\n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Arrays.sort(employees, new SurNameComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Arrays.sort(employees);  // Можно переопределить класс и имплементировать интерфейс Comparable,
                                // Затем переопределив compareTo
        /**
         * TODO 3. Создать новый компаратор добавив дополнительные поля в класс и отсортировать с использованием
         * созданного компаратора
         */
    }
}

class SalaryComparator implements Comparator<Employee> {

    // Если o1 > o2 = 1, o1 == o2 = 0, o1 < o2 = -1
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.calculateSalary(), o2.calculateSalary());  // меняя местами объекты, мы меняем сортировку
//        return o1.calculateSalary() == o2.calculateSalary() ? 0 :
//        (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
    }
}

class SurNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.surName.compareTo(o2.surName);
    }
}

abstract class Employee implements Comparable<Employee>{



    protected String firstName;
    protected String surName;
    protected double salary;

    public Employee(String firstName, String surName, double salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    public String getInfo() {
        return String.format("Сотрудник: %s %s; Ставка: %.2f; Среднемесячная заработная плата: %.2f",
                surName, firstName, salary, calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.calculateSalary(),o.calculateSalary());
    }
}

class Worker extends Employee {
    public Worker(String firstName, String surName, double salary) {
        super(firstName, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %.2f",
                surName, firstName, calculateSalary());
    }
}

/**
 * TODO 1. Разработать самостоятельно в рамках ДЗ
 */
class Freelancer {
    // salary * 18 * 5 - заработная плата в месяц
}