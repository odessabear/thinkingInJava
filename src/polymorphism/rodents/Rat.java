package polymorphism.rodents;

public class Rat extends Rodent {
    private String name = "Rat";
    private Borning borning = new Borning(name);
    private Dying dying = new Dying(name);

    public Rat(){
        System.out.println(this.name + " is here");
    }

    public void eat(String food){
        System.out.println("Rat eats " + food);
    }

    public void name(){
        System.out.println(this.name + " lives in a hole");
    }
}
