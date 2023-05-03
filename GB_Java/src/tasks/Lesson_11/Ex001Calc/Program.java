package tasks.Lesson_11.Ex001Calc;

public class Program {
    public static void main(String[] args) {
//        var m = new SummModel();
//        var v = new View();
        Presenter p = new Presenter(new View(), new SummModel());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
