package innerClasses.task14;

public class Unicycle implements Cycle {

    @Override
    public void cyclesMethod() {
        String name = "Unicycle";
        System.out.println(name + " is running");
    }


    static CycleFactory factory = () -> new Unicycle();
}

