package collections.task16;

import collections.codeFromBook.TextFile;

import java.util.*;

public class UniqueWords {

    private static void vowelCounter(Set<String> st) {
        Set<Character> vowels = new TreeSet<>();
        Collections.addAll(vowels,
                'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int allVowels = 0;
        Map<Character, Integer> vowelMap = new TreeMap<>();
        for (String s : st) {
            int count = 0;
            for (Character v : s.toCharArray()) {
                if (vowels.contains(v)) {

                    Integer everyCount = vowelMap.get(v);
                    vowelMap.put(v, everyCount == null ? 1 : everyCount + 1);
                    count++;
                    allVowels++;
                }
            }
            System.out.print(s + ": " + count + ", ");
        }
        System.out.println();
        System.out.println("Every vowel repeats " + vowelMap);
        System.out.println();
        System.out.print("Total vowels: " + allVowels);
    }


    public static void main(String[] args) {


        Set<String> words = new TreeSet<>(new TextFile("HelloClass.java", "\\W+"));


        System.out.println("****************************************************");
        System.out.println();
        System.out.println(words);
        System.out.println();
        System.out.println("*****************************************************");
        System.out.println();


        vowelCounter(words);

    }
}
//C:\Users\alexander.mikhailov\IdeaProjects\thinkingInJava\src\HelloClass.java
//C:\Users\alexander.mikhailov\IdeaProjects\thinkingInJava\HelloClass.java