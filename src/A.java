public class A extends C{
    private B b;

    public static void main(String[] args) {
        A a = new A();
    }
}

class C {
  C(){
      System.out.println("Class C was initialized");
  }
}
class B{
    B(){
        System.out.println("Constructor of B");
    }
}

