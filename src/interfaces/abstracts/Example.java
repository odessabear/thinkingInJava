package interfaces.abstracts;

abstract class ExampleAbstract {

    abstract void print();

    ExampleAbstract() {
        print();
    }
}

class Example1 extends ExampleAbstract {
    private int value = 5;

    @Override
    void print() {
        System.out.println(value);
    }
}

public class Example {
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.print();
    }
}
