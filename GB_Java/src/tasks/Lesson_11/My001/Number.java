package tasks.Lesson_11.My001;

public class Number {
    int intNumber;
    float floatNumber;
    double doubleNumber;
    public Number(int number){
        this.intNumber = number;
    }
    public Number(double number){
        this.doubleNumber = number;
    }
    public Number(float number){
        this.floatNumber = number;
    }
    public int summ(int number2){
        return this.intNumber + number2;
    }
    public double summ(double number2){
        return this.doubleNumber + number2;
    }
    public float summ(float number2){
        return this.floatNumber + number2;
    }
}
