package interfaces.task11;

import java.util.Arrays;

public class ChangePosition extends CharChanger {

    public String process(Object input) {
        return ChangePosition.lettersChanger((String)input);
    }

    private static String lettersChanger(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length-1; ) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
            i = i+2;
        }

        return new String(charArray);

        //System.out.println(s1);
    }

}
