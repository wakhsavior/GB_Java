package tasks.Seminar_12.ocp1;

public class SimpleDrawer {
    public void draw(Shape shape){
        switch ((shape.getShapeType())){
            case Circle -> {
                drawCircle(shape);
            }
            case Square -> {
                drawSquare(shape);
            }
        }
    }
    private void drawSquare(Shape shape){
        //...
    }
    private void drawCircle(Shape shape){
        //...
    }
}
