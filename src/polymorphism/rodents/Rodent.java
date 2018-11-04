package polymorphism.rodents;

public class Rodent {
    private String name = "Rodent";
    private Borning borning = new Borning(name);
    private Dying dying = new Dying(name);

    public Rodent(){
        System.out.println(this.name + " is here");
    }
    public void eat(String food) {
        System.out.println("Rodent eats " + food);
    }

    public void name() {
        System.out.println(this.name + " lives in a hole");
    }
}
