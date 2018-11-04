package polymorphism.rodents;

public class Mouse extends Rodent {
    private String name = "mouse";
    private Borning borning = new Borning(name);
    private Dying dying = new Dying(name);

    public Mouse(){
        System.out.println(this.name + " is here");
    }
    public void eat(String food){
        System.out.println("Mouse eats " + food);
    }

    public void name(){
        System.out.println(this.name + " lives in a hole");
    }
}
