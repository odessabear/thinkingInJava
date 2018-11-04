package polymorphism.rodents;

public class Mouse extends Rodent {
    private String name = "mouse";
    public void eat(String food){
        System.out.println("Mouse eats " + food);
    }

    public void name(){
        System.out.println(this.name + " lives in a hole");
    }
}
