package tasks.Seminar_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample_02 {
    private static Random rnd = new Random();
    private static final int workerNumber = 10;

    /**
     * TODO 2. Переработать метод generateEmployee(). Метод должен возвращать любого
     * случайного сотрудника разного типа (Worker, Freelancer)
     *
     * @return
     */
    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман", "Денис", "Артем", "Роман", "Андрей", "Михаил"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов", "Холдов", "Павлюшин", "Самойлов", "Пинаев"};
        int workerType = rnd.nextInt(3);
        System.out.println(workerType);
        int salary;
        int salaryIndex;
        switch (workerType) {
            case 0:
                salary = rnd.nextInt(900, 1500);
                salaryIndex = rnd.nextInt(28, 31);
                return new Worker(names[rnd.nextInt(10)], surnames[rnd.nextInt(10)], rnd.nextInt(47) + 18, salary * salaryIndex);
            case 1:
                ArrayList<Integer> workDays = new ArrayList<>();
                salary = rnd.nextInt(1500, 3000);
                for (int i = 0; i < 12; i++) {
                    workDays.add(rnd.nextInt(30));
                }
                return new Freelancer(names[rnd.nextInt(10)], surnames[rnd.nextInt(10)], rnd.nextInt(47) + 18, salary, workDays);
            case 2:
                ArrayList<Integer> workHours = new ArrayList<>();
                salary = rnd.nextInt(500, 800);
                salaryIndex = rnd.nextInt(28, 31);
                int additionalSalary = rnd.nextInt(100, 150);
                for (int i = 0; i < 12; i++) {
                    workHours.add(rnd.nextInt(360) + 120);
                }
                return new ContractorWorker(names[rnd.nextInt(10)], surnames[rnd.nextInt(10)], rnd.nextInt(47) + 18, salary * salaryIndex, additionalSalary, workHours);
        }
        return null;

    }

    public static void main(String[] args) {

//        Worker worker = new Worker("Глеб", "григорьев", 120000);
//        System.out.println(worker);
        Employee[] employees = new Employee[workerNumber];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Arrays.sort(employees, new SalaryComparator());

        System.out.println("\n*** Отсортированный по заработной плате массив ***\n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\n*** Отсортированный по фамилии массив ***\n");

        Arrays.sort(employees, new SurNameComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\n*** Отсортированный с использование переопределнным compareTo массив (по зарплате) ***\n");
        Arrays.sort(employees);  // Можно переопределить класс и имплементировать интерфейс Comparable,
        // Затем переопределив compareTo
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Arrays.sort(employees, new ageComparator());
        System.out.println("\n*** Отсортированный по возрасту массив ***\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        /**
         * TODO 3. Создать новый компаратор добавив дополнительные поля в класс и отсортировать с использованием
         * созданного компаратора
         */
    }
}

class ageComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.age, o2.age);
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

class SurNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.surName.compareTo(o2.surName);
    }
}

abstract class Employee implements Comparable<Employee> {


    protected String firstName;
    protected String surName;
    protected int age;
    protected double salary;

    public Employee(String firstName, String surName, int age, double salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
        this.age = age;

    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s: %d лет; Ставка: %.2f; Среднемесячная заработная плата: %.2f",
                surName, firstName, age, salary, calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.calculateSalary(), o.calculateSalary());
    }
}

class Worker extends Employee {
    public Worker(String firstName, String surName, int age, double salary) {
        super(firstName, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %d лет; Рабочий; Среднемесячная заработная плата: %.2f",
                surName, firstName, age, calculateSalary());
    }
}

/**
 * TODO 1. Разработать самостоятельно в рамках ДЗ
 */
class Freelancer extends Employee {
    protected ArrayList<Integer> workedDaysPerMonth;

    public Freelancer(String firstName, String surName, int age, double salary, ArrayList<Integer> workedDaysPerMonth) {
        super(firstName, surName, age, salary);
        this.workedDaysPerMonth = workedDaysPerMonth;
    }

    public void setWorkedDaysPerMonth(ArrayList<Integer> workedDaysPerMonth) {
        if (workedDaysPerMonth.size() > 12) {
            for (int i = 0; i < 12; i++) {
                this.workedDaysPerMonth.add(workedDaysPerMonth.get(workedDaysPerMonth.size() - 12 + i));
            }

        } else {
            this.workedDaysPerMonth = workedDaysPerMonth;
        }
    }

    @Override
    public double calculateSalary() {
        double summ = 0;
        for (int i = 0; i < workedDaysPerMonth.size(); i++) {
            summ = summ + workedDaysPerMonth.get(i) * this.salary;
        }
        return summ / workedDaysPerMonth.size();
    }

    @Override
    public String toString() {
        return String.format("%s %s: %d лет; Фрилансер; Среднемесячная заработная плата: %.2f",
                surName, firstName, age, calculateSalary());
    }
}

class ContractorWorker extends Employee {
    protected ArrayList<Integer> workedAdditionHourPerMonth;
    protected double additionSalary;

    public ContractorWorker(String firstName, String surName, int age, double salary, double additionSalary, ArrayList<Integer> workedAdditionHourPerMonth) {
        super(firstName, surName, age, salary);
        this.additionSalary = additionSalary;
        this.workedAdditionHourPerMonth = workedAdditionHourPerMonth;
    }

    public void workedAdditionHourPerMonth(ArrayList<Integer> workedDaysPerMonth) {
        if (workedDaysPerMonth.size() > 12) {
            for (int i = 0; i < 12; i++) {
                this.workedAdditionHourPerMonth.add(workedDaysPerMonth.get(workedDaysPerMonth.size() - 12 + i));
            }

        } else {
            this.workedAdditionHourPerMonth = workedDaysPerMonth;
        }
    }

    @Override
    public double calculateSalary() {

        double summ = this.salary;
        for (int i = 0; i < workedAdditionHourPerMonth.size(); i++) {
            summ = summ + workedAdditionHourPerMonth.get(i) * this.additionSalary;
        }
        return summ / workedAdditionHourPerMonth.size();
    }

    @Override
    public String toString() {
        return String.format("%s %s: %d лет; Контрактник; Среднемесячная заработная плата: %.2f",
                surName, firstName, age, calculateSalary());
    }

}


