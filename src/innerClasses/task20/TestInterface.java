package innerClasses.task20;

public interface TestInterface {
    void printName();

    class IntImpl implements TestInterface{
        @Override
        public void printName() {
            System.out.println("Nested Implementation");
        }

        public static void main(String[] args) {
            IntImpl impl = new IntImpl();
            impl.printName();
        }
    }
}
