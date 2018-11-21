package polymorphism.rodents;

public class Rat extends Rodent {
    private String name = "Rat";
    private Borning borning = new Borning(name);
    private Dying dying = new Dying(name);

    public Rat(Shared shared){
        super(shared);
        System.out.println(this.name + " is here");
    }

    public void eat(String food){
        System.out.println("Rat eats " + food);
    }

    public String toString(){
        return name + " , " + super.toString();
    }
}
