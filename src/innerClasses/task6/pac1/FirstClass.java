package innerClasses.task6.pac1;

import innerClasses.task6.Name;

public class FirstClass {

  protected class NameImpl implements Name {

      public NameImpl(){}
      @Override
      public void callTheName() {
          System.out.println("Call me? I'm here");
      }
  }
}
