package exceptions;

class Ex4Exception extends Exception{

    public Ex4Exception(String message){
        super(message);
    }
}

public class Ex4 {

    static void f() throws Ex4Exception{
        System.out.println(" f() ");
        throw new Ex4Exception(" Called in f()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Ex4Exception e) {
            System.err.println("Caught Ex4Exception");
            e.printStackTrace();
        }
    }
}
