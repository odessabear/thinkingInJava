package interfaces.task18;

public class CycleFactories {
    private static void cycleConsumer(CycleFactory cycle){
        Cycle newCycle = cycle.getCycle();
        newCycle.cyclesMethod();
    }

    public static void main(String[] args) {
        cycleConsumer(new UnicycleFactory());
        cycleConsumer(new BicycleFactory());
        cycleConsumer(new TricycleFactory());
    }
}
