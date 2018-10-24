package inheritance;

class Amphibian{
    public void move(){
        System.out.println("It's moving");
    }
    public void sleep(){
        System.out.println("It's sleeping");
    }

    public void eat(){
        System.out.println("It's eating");
    }
}

public class Frog extends Amphibian{

    @Override
    public void eat() {
        System.out.println("It likes dragonfly");
    }

    @Override
    public void sleep() {
        System.out.println("It sleeps on the flower in the swamp ");
    }

    @Override
    public void move() {
        System.out.println(" It's jumping");
    }

    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.eat();
        frog.move();
        frog.sleep();
     }
}
