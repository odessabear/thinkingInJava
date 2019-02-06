package interfaces.task18;

public class Bicycle implements Cycle {
    private String name = "Bicycle";
    @Override
    public void cyclesMethod() {
        System.out.println(name + " is running");
    }
}

class BicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
