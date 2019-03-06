package innerClasses.task18and19;

public class Outer1 {
    class Inner1{

        String name(){
            return Inner1.class.getName();
        }
        class Inner2{
            String name(){
                return Inner2.class.getName();
            }
        }
    }

    static class Nested1{
        String name(){
            return Nested1.class.getName();
        }
        static class Nested2{
            String name(){
                return Nested2.class.getName();
            }
        }
    }

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Outer1.Inner1 inner1 = outer1.new Inner1();
        System.out.println(inner1.name());
        Inner1.Inner2 inner2 = inner1.new Inner2();
        System.out.println(inner2.name());
        Nested1 nested1 = new Nested1();
        System.out.println(nested1.name());
        Nested1.Nested2 nested2 = new Nested1.Nested2();
        System.out.println(nested2.name());
    }
}
