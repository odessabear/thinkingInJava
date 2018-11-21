package polymorphism.rodents;

public class Mouse extends Rodent {
    private String name = "Mouse";
    private Borning borning = new Borning(name);
    private Dying dying = new Dying(name);

    public Mouse(Shared shared){
        super(shared);
        System.out.println(this.name + " is here");
    }
    public void eat(String food){
        System.out.println("Mouse eats " + food);
    }

    public String toString(){
        return name + " , " + super.toString();
    }
}
