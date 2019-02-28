package innerClasses.task13;

public class SecondClass {
    private FirstClass getValues() {

        return new FirstClass(2,3) {
        };
    }

    public static void main(String[] args) {
        SecondClass second = new SecondClass();
        FirstClass first = second.getValues();
        System.out.println(first.showValue());
    }
}