package polymorphism.rodents;

public class Hamster extends Rodent {

    private String name = "Hamster";
    public void eat(String food){
        System.out.println("Hamster eats " + food);
    }

    public void name(){
        System.out.println(this.name + " lives in a hole");
    }
}
