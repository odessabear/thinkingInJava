package interfaces.task13;

interface ParentInterface {
    void mainMethod();
}

interface Interface1 extends ParentInterface {
    void method1();
}

interface Interface2 extends ParentInterface {
    void method2();
}

interface Interface3 extends Interface1, Interface2 {
    void method3();
}

class ResultClass implements Interface3{

    @Override
    public void mainMethod() {
        System.out.println("Main");
    }

    @Override
    public void method1() {
        System.out.println("First");
    }

    @Override
    public void method2() {
        System.out.println("Second");
    }

    @Override
    public void method3() {
        System.out.println("Third");
    }
}
public class Test13 {
    public static void main(String[] args) {
        ResultClass result = new ResultClass();

        result.mainMethod();
        result.method1();
        result.method2();
        result.method3();
    }
}