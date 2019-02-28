package innerClasses.task13;

class FirstClass {
    private int firstValue;
    private int secondValue;

    FirstClass(int x, int y) {
        firstValue = x;
        secondValue = y;
    }

    int showValue() {
        return firstValue * secondValue;
    }
}
