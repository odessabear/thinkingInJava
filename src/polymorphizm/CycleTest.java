package polymorphizm;

class Cycle {
    private String name = "Cycle";
    public static void move(Cycle cycle) {
        System.out.println(cycle + " is moving");
    }
    public String toString(){
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";
    public String toString(){
        return this.name;
    }
}

class Bicycle extends Cycle{
    private String name = "Bicycle";
    public String toString(){
        return this.name;
    }
}

class Tricycle extends Cycle{
    private String name = "Tricycle";
    public String toString(){
        return this.name;
    }
}

public class CycleTest {
    public static void ride(Cycle cycle){
        cycle.move(cycle);
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
