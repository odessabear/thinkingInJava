package inheritance;

class BeforeOverload {

    public int returnValue(int i) {
        return i;
    }


    public double returnValue(double d){
        return d;
    }

    public char returnValue(char c){
        return c;
    }
}

public class Overloading extends BeforeOverload{

    public float returnValue(float f){
        return f;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        System.out.println(overloading.returnValue(12));
        System.out.println(overloading.returnValue(45.45));
        System.out.println(overloading.returnValue('a'));
        System.out.println(overloading.returnValue(0.1f));
    }
}
