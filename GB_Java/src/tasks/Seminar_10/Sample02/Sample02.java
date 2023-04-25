package tasks.Seminar_10.Sample02;

public class Sample02 {
    public static void main(String[] args) {
        DebetAccount<Entity> entityDebetAccount1 =
                new DebetAccount<>(new Entity("Рога и копыта", "1112222"), 2000000);
        CreditAccount<Person> personCreditAccount1 =
                new CreditAccount<>(new Person("Иванов", "Андей", "123213123"), 20);
        System.out.println(personCreditAccount1);
        System.out.println(entityDebetAccount1);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
    Transaction<Account<?>> transaction1 = new Transaction<>(entityDebetAccount1,personCreditAccount1,10000);
    transaction1.execute();
        transaction1 = new Transaction<>(entityDebetAccount1,personCreditAccount1,30000);
        transaction1.execute();

    }
}

class Transaction<T extends Account<? extends PersonalData>> {
    private final T from;
    private final T to;
    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute() {
        if (from.getAmount() >= amount) {
            System.out.printf("Осуществлен перевод средств между счетами на сумму %.2f руб", amount);
            System.out.printf("Счет списания #%s: %.2f руб.\nСчет зачисления: #%s: %.2f руб.\n",
                    from.getData(),from.getAmount(),to.getData(),to.getAmount());
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);
            System.out.println(from);
            System.out.println(to);
        } else {
            System.out.println("Операция невозможна, недостаточно средств на счете.");
        }
    }
}

class CreditAccount<T extends PersonalData> extends Account<T> {

    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}

class DebetAccount<T extends PersonalData> extends Account<T> {

    public DebetAccount(T data, double amount) {
        super(data, amount);
    }
}

interface PersonalData {
    String getINN();
}

abstract class Account<T extends PersonalData> {
    private final T data;
    private double amount;

    public T getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%s; %.2f руб", data, amount);
    }
}

/**
 * Физлицо
 */

class Person implements PersonalData {
    private final String lastName;
    private final String firstName;
    private final String inn;

    @Override
    public String getINN() {
        return inn;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person(String lastName, String firstName, String inn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s", firstName, lastName, inn);
    }
}

/**
 * Юридическое лицо
 */
class Entity implements PersonalData {
    private final String name;
    private final String inn;

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getINN() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", name, inn);
    }
}