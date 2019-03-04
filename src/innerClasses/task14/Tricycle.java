package innerClasses.task14;

public class Tricycle implements Cycle {

    @Override
    public void cyclesMethod() {
        String name = "Tricycle";
        System.out.println(name + "is running");

    }

    static CycleFactory factory = () -> new Tricycle();
}

