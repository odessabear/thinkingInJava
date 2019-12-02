package rttiAndReflection.t3;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape{

    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
//        List<Shape> shapeList = Arrays.asList(
//                new Circle(), new Square(), new Triangle(),new Rhomboid()
//        );
//        for(Shape shape : shapeList)
//            shape.draw();
        Rhomboid figure = new Rhomboid();
        ((Shape)figure).draw();
        //((Circle)figure).draw();

    }
}
