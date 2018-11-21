package polymorphism;

class Cycle {
    private String name = "Cycle";
    private int wheels = 0;

    public static void move(Cycle cycle) {
        System.out.print(cycle + " is moving ");
    }

    public int wheels() {
        return wheels;
    }

//    public void balance(){
//        System.out.println("Information about a balance");
//    }

    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";
    private int wheels = 1;

    @Override
    public int wheels() {
        return wheels;
    }

    public void balance(){
        System.out.println("Bad balance");
    }

    public String toString() {

        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int wheels = 2;

    @Override
    public int wheels() {
        return wheels;
    }
    public void balance(){
        System.out.println("Normal balance");
    }

    public String toString() {

        return this.name;
    }
}

class Tricycle extends Cycle {
    private String name = "Tricycle";
    private int wheels = 3;

    @Override
    public int wheels() {
        return wheels;
    }

    public String toString() {

        return this.name;
    }
}

public class CycleTest {
    public static void ride(Cycle cycle) {
        cycle.move(cycle);
        System.out.println(" with " + cycle.wheels() + " wheels");
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        ride(unicycle);
        ride(bicycle);
        ride(tricycle);

    }
}
