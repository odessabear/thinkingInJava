package innerClasses.task1;

public class Outer {
    private class Inner{
      private void sayHi(){
          System.out.println("Hi!I'm an inner class!");
      }
    }

    private Inner showInnerClass(){
        return new Inner();
    }
//    public Inner printMessage(){
//        Inner inner = showInnerClass();
//        return inner;
//    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.showInnerClass();
        inner.sayHi();
    }
}
