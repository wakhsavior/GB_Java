package tasks.Seminar_12.srp1;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1),5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        SquareDrawer squareDrawer = new SquareDrawer(square,2);
        squareDrawer.draw();
    }
}
