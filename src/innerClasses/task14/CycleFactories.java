package innerClasses.task14;

public class CycleFactories {
    private static void cycleConsumer(CycleFactory cycle){
        Cycle newCycle = cycle.getCycle();
        newCycle.cyclesMethod();
    }

    public static void main(String[] args) {
        cycleConsumer(Unicycle.factory);
        cycleConsumer(Bicycle.factory);
        cycleConsumer(Tricycle.factory);
    }
}
