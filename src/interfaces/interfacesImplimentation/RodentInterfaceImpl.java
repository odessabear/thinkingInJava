package interfaces.interfacesImplimentation;

import interfaces.subinterface.RodentIterface;

class Rat implements RodentIterface {

    @Override
    public void eat() {
        System.out.println("Rat is eating");
    }

    @Override
    public void run() {
        System.out.println("Rat is running");
    }

    @Override
    public void sleep() {
        System.out.println("Rat is sleeping");
    }
}

class Mouse implements RodentIterface {

    @Override
    public void eat() {
        System.out.println("Mouse is eating");

    }

    @Override
    public void run() {
        System.out.println("Mouse is running");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping");
    }
}

class Hamster implements RodentIterface {

    @Override
    public void eat() {
        System.out.println("Hamster is eating");
    }

    @Override
    public void run() {
        System.out.println("Hamster is running");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster is sleeping");
    }
}

public class RodentInterfaceImpl {

    public static void main(String[] args) {
        RodentIterface[] roodents = {new Rat(),new Mouse(),new Hamster()};

        for (RodentIterface rodent : roodents){
            rodent.run();
            rodent.eat();
            rodent.sleep();
        }
    }
}
