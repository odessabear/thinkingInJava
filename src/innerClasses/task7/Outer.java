package innerClasses.task7;

public class Outer {
    private int value = 0;

    private void showValue() {
        System.out.println(value + 5);
    }

    private void callInner() {
        Inner inner = new Inner();
        inner.changeOuter();
    }

    private class Inner {
        void changeOuter() {
            value = value + 10;
            showValue();
        }

    }

    public static void main(String[] args) {
        Outer out = new Outer();
        out.showValue();
        out.callInner();
        out.showValue();

    }

}



