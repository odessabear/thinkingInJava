package interfaces.task18;

public class Tricycle implements Cycle {
    private String name = "Tricycle";
    @Override
    public void cyclesMethod() {
        System.out.println(name + "is running");
    }
}

class TricycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
