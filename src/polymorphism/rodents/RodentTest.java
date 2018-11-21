package polymorphism.rodents;

public class RodentTest {


    public static void main(String[] args) {
        Shared shared = new Shared();
        Rodent[] rodents = {
                new Mouse(shared),
                new Hamster(shared),
                new Rat(shared),
                new Mouse(shared),
                new Hamster(shared)
        };

        for (Rodent rodent : rodents) {
            rodent.toString();
        }
    }
}
