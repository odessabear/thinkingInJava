package collections.task16;

import collections.codeFromBook.TextFile;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(new TextFile("C:\\Users\\alexander.mikhailov\\IdeaProjects\\thinkingInJava\\src\\HelloClass.java", "\\W+"));

        System.out.println("****************************************************");
        System.out.println();
        System.out.println(words);
        System.out.println();
        System.out.println("*****************************************************");

    }
}
//C:\Users\alexander.mikhailov\IdeaProjects\thinkingInJava\src\HelloClass.java
//C:\Users\alexander.mikhailov\IdeaProjects\thinkingInJava\HelloClass.java