package interfaces.task18;

public class Unicycle implements Cycle {
    private String name = "Unicycle";
    @Override
    public void cyclesMethod() {
        System.out.println(name + " is running");
    }
}

class UnicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
