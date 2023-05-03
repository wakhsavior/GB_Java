package tasks.Lesson_11.Ex001Calc;

public class SummModel extends CalcModel{
    public SummModel(){

    }

    @Override
    public int result() {
        return x + y;
    }

    @Override
    public void setX(int value) {
    super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }
}
