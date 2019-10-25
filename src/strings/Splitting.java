package strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitting {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest..." +
            "with... a herring!";
    public static void split(String regex){
        System.out.println(Arrays.deepToString(knights.split(regex)));
    }

    public static void main(String[] args) {
        String s = Splitting.knights;
        String s2 = "Good fucking afternoon!";
        String s3 = "Good fucking afternoon.";
        System.out.println("-------------------------------------------");
        split("the|you");
        System.out.println("-------------------------------------------");
        System.out.println(s.replaceAll(("[aeuioAEIOU]"),"_"));
        System.out.println("-------------------------------------------");
        System.out.println(s2.matches("^[A-Z].*[.]$"));
        System.out.println(s3.matches("^[A-Z].*[.]$"));

    }
}
