package polymorphism;

import interfaces.subinterface.FastFood;

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Pickle {
    Pickle() {
        System.out.println("Pickle()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch implements FastFood {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    private Pickle pickle = new Pickle();

    Sandwich() {
        System.out.println("Sandwich()");
    }


    @Override
    public void order() {
        System.out.println("Give me please a sandwich");
    }

    @Override
    public void bringing() {
        System.out.println("That's your sandwich");
    }

    @Override
    public void price() {
        System.out.println("A sandwich costs 5 dollars");
        System.out.println("Ok!");
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();

        sandwich.order();
        sandwich.price();
        sandwich.bringing();
    }
}
