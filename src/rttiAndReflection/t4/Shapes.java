package rttiAndReflection.t4;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {

    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(),new Rhomboid()
        );
        for(Shape shape : shapeList)
            rotate(shape);
    }

    private static void rotate(Shape shape){

        if (shape instanceof Circle){
            ((Circle)shape).draw();
        }else{
            System.out.println("shape is not Circle");
        }
    }
}
