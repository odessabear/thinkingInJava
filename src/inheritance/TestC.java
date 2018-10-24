package inheritance;

class A {
    A(int i) {
        System.out.println("inheritance.inheritance.A constructor");
    }
}

class B extends A{
    B(int i) {
        super(i);
        System.out.println("inheritance.B constructor");
    }
}

public class TestC extends A {

    B b = new B(13);

    TestC() {
        super(12);

    }

    public static void main(String[] args) {
        TestC testC = new TestC();
    }
}
