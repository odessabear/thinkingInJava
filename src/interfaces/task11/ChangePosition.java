package interfaces.task11;

import java.util.Arrays;

 class ChangePosition {

     Object process(Object input) {
         return new ChangePosition(){


             private String lettersChanger(String s){
                 char[] charArray = s.toCharArray();
                 for (int i = 0; i < charArray.length - 1; ) {
                     char temp = charArray[i];
                     charArray[i] = charArray[i + 1];
                     charArray[i + 1] = temp;
                     i = i + 2;
                 }

                 return new String(charArray);

             }
         };
     }

}
