package tasks.Seminar_12.ocp1;

public class Shape {
    private ShapeType shapeType;
    public ShapeType getShapeType(){
        return shapeType;
    }
    public Shape(ShapeType shapeType){
        this.shapeType = shapeType;
    }
}
