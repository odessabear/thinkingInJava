package interfaces.task11;

import java.util.Arrays;

public class ChangePosition extends CharChanger {

    public static String toChangePosition() {

        return null;
    }

    public String process(Object input) {
        return ((String) input).toLowerCase();
    }

    public void lettersChanger(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length-1; ) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
            i = i+2;
        }

        System.out.println(Arrays.toString(charArray));
    }


    public static void main(String[] args) {
        ChangePosition changer = new ChangePosition();
        String s = "ahahahah";
        changer.lettersChanger(s);

    }
}
