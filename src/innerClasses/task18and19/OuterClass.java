package innerClasses.task18and19;

public class OuterClass {
    private static class NestedClass {
        static int x = 100;
        void printHi() {
            System.out.println("Hello!");
        }
        static int returnValue(){
            return x;
        }
    }

    public static void main(String[] args) {
        NestedClass nested = new NestedClass();
        nested.printHi();
        int value = NestedClass.returnValue();
        System.out.println(value);
    }
}
