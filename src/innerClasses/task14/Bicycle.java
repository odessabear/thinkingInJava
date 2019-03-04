package innerClasses.task14;

public class Bicycle implements Cycle {

    @Override
    public void cyclesMethod() {
        String name = "Bicycle";
        System.out.println(name + " is running");
    }

    static CycleFactory factory = () -> new Bicycle();
}



