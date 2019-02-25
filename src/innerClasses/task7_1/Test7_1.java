package innerClasses.task7_1;

public class Test7_1 {
  private Name returnName(String name){
      class NameImpl implements Name{
          private String nameImpl;
          private NameImpl(String name){
              nameImpl = name;
          }
          public String returnString(){
              return nameImpl;
          }
      }
      return new NameImpl(name);
  }

    public static void main(String[] args) {
        Test7_1 test = new Test7_1();
        Name n = test.returnName("inner name");
        System.out.println(n.returnString());

    }
}
