package innerClasses.task21;

interface Test{
    void sayHello();
    String returnString();

    class NestedInTest{
        static void returnResults(Test test){
            test.sayHello();
            System.out.println(test.returnString());
        }
    }
}

public class Task21 implements Test{

    @Override
    public void sayHello() {
        System.out.println("Hello,pel");
    }

    @Override
    public String returnString() {
        return "It's me";
    }

    public static void main(String[] args) {
        Task21 task = new Task21();
        Test.NestedInTest.returnResults(task);
    }
}
