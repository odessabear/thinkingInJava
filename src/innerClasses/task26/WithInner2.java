package innerClasses.task26;
class WithInner1 {
    class InnerClass1 {
        private int x;
        private String name;

        public InnerClass1(int x, String name) {
            this.x = x;
            this.name = name;
            System.out.println("InnerClass " + x + name);
        }
    }
}
public class WithInner2 {
     public class Innerclass2 extends WithInner1.InnerClass1 {

         Innerclass2(WithInner1 wi1) {
            wi1.super(1, "-st class");
            System.out.println("Second Inner Class");
        }

     }

    public static void main(String[] args) {
        WithInner1 wi1 = new WithInner1();
        WithInner2 wi2 = new WithInner2();
        Innerclass2 i2 = wi2.new Innerclass2(wi1);

    }

}




