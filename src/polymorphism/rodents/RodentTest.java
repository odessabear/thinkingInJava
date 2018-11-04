package polymorphism.rodents;

public class RodentTest {

    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Hamster(),
                new Rat()
        };

        for (Rodent rodent : rodents) {
            rodent.name();
            rodent.eat(" corn");
        }
    }
}
