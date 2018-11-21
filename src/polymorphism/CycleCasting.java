package polymorphism;

public class CycleCasting {
    public static void main(String[] args) {
        Cycle[] cycles = {new Unicycle(),
        new Bicycle(),new Tricycle()};

//        for (Cycle cycle : cycles){
//            cycle.balance();
//        }

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
//        ((Bicycle)cycles[2]).balance();
    }
}
