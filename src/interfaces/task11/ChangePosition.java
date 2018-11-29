package interfaces.task11;

import interfaces.subinterface.Processor;

import java.util.Arrays;

public class ChangePosition implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        return null;
    }

    public String toChangePosition(){

        return null;
    }

//    public static void main(String[] args) {
//        String s = "go fuck away";
//        char [] charArray = s.toCharArray();
//        System.out.println(Arrays.toString(charArray));
//    }
}
