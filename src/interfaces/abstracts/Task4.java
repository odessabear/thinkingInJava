package interfaces.abstracts;

abstract class Basic {

}

class Child extends Basic {
    void doSomething() {
        System.out.println("Everything is fine");
    }
}

abstract class Basic2 {
    abstract void doSomthing2();
}

class Child2 extends Basic2 {

    @Override
    void doSomthing2() {
        System.out.println("Everything is fine again");
    }
}

public class Task4 {

    private static void test(Basic basic) {
        ((Child) basic).doSomething();
    }

    private static void test2(Basic2 basic2) {
        basic2.doSomthing2();
    }

    public static void main(String[] args) {
        Child child = new Child();
        Task4.test(child);
        Child2 child2 = new Child2();
        Task4.test2(child2);
    }
}
