package interfaces.task11;

import interfaces.subinterface.Processor;

public abstract class CharChanger implements Processor {
    public String name(){
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static String s = "don't fuck my mind";

    public static void main(String[] args) {

    }
}
