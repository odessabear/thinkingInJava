package innerClasses.task1.task3;

public class Outer {
    private String string;
    public Outer(String s){
        string = s;
    }
    private class Inner{
      public String toString(){
          return string;
      }
    }

    private Inner showInnerClass(){
        return new Inner();
    }


    public static void main(String[] args) {
        Outer outer = new Outer("hello!");
        Inner inner = outer.showInnerClass();
        System.out.println(inner.toString());
    }
}
