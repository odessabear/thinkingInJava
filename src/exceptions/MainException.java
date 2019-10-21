package exceptions;

import java.io.FileInputStream;

public class MainException {

    public static void main(String[] args) throws Exception{
        FileInputStream file = new FileInputStream("C:\\Users\\alexander.mikhailov\\IdeaProjects\\thinkingInJava\\src\\exceptions\\MainException.java");

        file.close();
    }
}
