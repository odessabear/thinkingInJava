package interfaces;

abstract class Rodent {

    abstract void eat();

    abstract void sleep();

    abstract void run();
}

class Rat extends Rodent {
    private String name = "Rat";

    @Override
    void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    void run() {
        System.out.println(name + " is running");
    }

    public String toString() {
        return "Rat";
    }
}

class Hamster extends Rodent {
    private String name = "Hamster";

    @Override
    void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    void run() {
        System.out.println(name + " is running");
    }
}

class Mouse extends Rodent {
    private String name = "Mouse";

    @Override
    void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    void run() {
        System.out.println(name + " is running");
    }
}

public class RodentAbstract {
    public static void main(String[] args) {


        Rodent[] rodents = {new Mouse(),new Rat(),new Hamster()};

        for (Rodent rodent:rodents){
            rodent.run();
            rodent.eat();
            rodent.sleep();
        }
    }
}
