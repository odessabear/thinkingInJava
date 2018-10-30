package polymorphism.shape;

public class Square extends Shape {

    @Override
    public void draw(){
        System.out.println("Square.draw()");
    }

    @Override
    public void erase(){
        System.out.println("Square.erase()");
    }

    @Override
    public void turnAround(){
        System.out.println("Square is turning around");
    }
}
