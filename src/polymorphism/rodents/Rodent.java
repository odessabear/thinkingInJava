package polymorphism.rodents;

public class Rodent {
    private String name = "Rodent";
    public void eat(String food) {
        System.out.println("Rodent eats " + food);
    }

    public void name() {
        System.out.println(this.name + " lives in a hole");
    }
}
