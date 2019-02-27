package innerClasses.task9;

import innerClasses.task10.Name;

public class Test9 {
    private Number showNumber()
    {
        return new Number() {
            int number = 2019;

            @Override
            public void printNumber() {
                System.out.println(number);
            }
        };
    }

    public static void main(String[] args) {
        Test9 test = new Test9();
        Number number = test.showNumber();
        number.printNumber();
    }
}
