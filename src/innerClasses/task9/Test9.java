package innerClasses.task9;

public class Test9 {
    private class NumberImpl implements Number {
        int number = 2019;

        @Override
        public void printNumber() {
            System.out.println(number);
        }
    }

    private Number showTheNumber() {
        return new NumberImpl();
    }

    public static void main(String[] args) {
        Test9 test = new Test9();
        test.showTheNumber().printNumber();
    }
}
