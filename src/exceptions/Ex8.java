package exceptions;

class Ex8Exception{

    static void method() throws Ex4Exception{
        System.out.println("throwing Exception in method()");
        throw new Ex4Exception("throw exception in the method()");
    }

}
public class Ex8 {
    public static void main(String[] args) {
        try {
            Ex8Exception.method();
        } catch (Ex4Exception e) {
            System.out.println("caught Ex4Exception in catch block");
            e.printStackTrace();
        }
    }
}
