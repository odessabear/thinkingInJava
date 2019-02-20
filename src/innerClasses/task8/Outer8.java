package innerClasses.task8;

public class Outer8 {


   private class Inner8 {
        private String name = "Inner9";

        private void printName() {
            System.out.println(name + " name");
        }


    }

    private Inner8 innerName = new Inner8();


    private void showInnerName() {
        System.out.println(innerName.name);
        innerName.printName();
    }

    public static void main(String[] args) {

        Outer8 outer8 = new Outer8();
        outer8.showInnerName();
//        Inner8 inner = outer8.new Inner8();
//        inner.printName();

    }
}
