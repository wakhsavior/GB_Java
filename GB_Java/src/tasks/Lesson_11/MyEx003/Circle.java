package tasks.Lesson_11.MyEx003;

public class Circle extends Figure{
    double radius;
    final double  PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double square (){
        return radius * radius * PI;
    }
}
