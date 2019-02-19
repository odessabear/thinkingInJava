package innerClasses.task7;

//public class Outer {
//    private int value = 0;
//
//    private void showValue() {
//        System.out.println(value);
//    }
//
//    public void callInner() {
//        Inner inner = new Inner();
//        inner.changeOuter();
//    }
//
//    private class Inner {
//        void changeOuter() {
//            value = value + 10;
//            showValue();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Outer out = new Outer();
//        out.showValue();
//        out.callInner();
//        out.showValue();
//
//    }
//
//}

class Outer7 {
    private int oi = 1;
    private void hi() { System.out.println("Outer hi"); }
    class Inner {
        void modifyOuter() {
            oi *= 2;
            hi();
        }
    }
    private void showOi() { System.out.println(oi); }
    void testInner() {
        Inner in = new Inner();
        in.modifyOuter();
    }
    public static void main(String[] args) {
        Outer7 out = new Outer7();
        out.showOi();
        out.testInner();
        out.showOi();
    }
}

