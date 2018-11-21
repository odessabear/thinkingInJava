package polymorphism.rodents;

public class Hamster extends Rodent {

    private String name = "Hamster";
    private Borning borning = new Borning(name);
    private Dying dying = new Dying(name);

    public Hamster(Shared shared) {
        super(shared);
        System.out.println(this.name + " is here");
    }

    public void eat(String food) {
        System.out.println("Hamster eats " + food);
    }

    public String toString(){
        return name + " , " + super.toString();
    }
}