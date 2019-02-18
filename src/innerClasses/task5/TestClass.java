package innerClasses.task5;

public class TestClass {

    public static void main(String[] args) {
        OuterClass object = new OuterClass();
        OuterClass.InnerClass innerClass = object.new InnerClass();

    }
}
