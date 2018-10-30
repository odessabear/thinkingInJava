package polymorphism.shape;

public class Pentagon extends Shape{
    @Override
    public void draw(){
        System.out.println("Pentagon.draw()");
    }

    @Override
    public void erase(){
        System.out.println("Pentagon.erase()");
    }

    @Override
    public void turnAround(){
        System.out.println("Pentagon is turning around");
    }
}
