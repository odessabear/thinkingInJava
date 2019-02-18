package innerClasses.task6.pac2;

import innerClasses.task6.Name;
import innerClasses.task6.pac1.FirstClass;

public class SecondClass extends FirstClass {

    private Name returnNameImplClass(){
        return this.new NameImpl();
    }

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        FirstClass.NameImpl ni = firstClass.new NameImpl();
        ni.callTheName();

        SecondClass secondClass = new SecondClass();
        secondClass.returnNameImplClass();
    }

}
