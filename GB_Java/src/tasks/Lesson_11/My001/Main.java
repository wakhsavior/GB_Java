package tasks.Lesson_11.My001;

public class Main {
    public static void main(String[] args) {
        Number number1 = new Number(10);
        Number number2 = new Number(10.5f);
        Number number3 = new Number(10.10);


        System.out.println(number1.summ(5));
        System.out.println(number2.summ(5.5f));
        System.out.println(number3.summ(7.6));

    }
}
