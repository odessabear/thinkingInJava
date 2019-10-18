package exceptions;

class ExceptionA extends Exception{}
class ExceptionB extends Exception{}

public class Ex10 {
    static void f(){
        System.err.println("In method f()");
        try {
            g();
        } catch (ExceptionA exceptionA) {
            System.out.println("Caught in f() try ");
            exceptionA.printStackTrace();
            throw new RuntimeException();
        }
    }

    static void g() throws ExceptionA{
        System.err.println("In the method g()");
        throw new ExceptionA();
    }

    public static void main(String[] args) {
        f();
    }
}
