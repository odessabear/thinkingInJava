package interfaces.task11;

import interfaces.subinterface.Processor;

import java.util.Arrays;

public class ChangePosition extends CharChanger{

    public static String toChangePosition(){

        return null;
    }

    public String process(Object input){
        return ((String)input).toLowerCase();
    }




//    public static void main(String[] args) {
//        String s = "go fuck away";
//        char [] charArray = s.toCharArray();
//        System.out.println(Arrays.toString(charArray));
//    }
}
