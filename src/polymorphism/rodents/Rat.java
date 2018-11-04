package polymorphism.rodents;

public class Rat extends Rodent {
    private String name = "Rat";

    public void eat(String food){
        System.out.println("Rat eats " + food);
    }

    public void name(){
        System.out.println(this.name + " lives in a hole");
    }
}
