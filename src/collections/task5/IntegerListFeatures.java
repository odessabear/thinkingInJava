package collections.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntegerListFeatures {
    private static List<Integer> listOfRandInteger(int length, int n) {
        Random rand = new Random();
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < length; i++)
            li.add(rand.nextInt(n));
        return li;
    }
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerList = listOfRandInteger(7,10);
        System.out.println("1: " + integerList);
        Integer integer = random.nextInt(10);
        integerList.add(integer);
        System.out.println("2: " + integerList);
        System.out.println("3: " + integerList.contains(integer));
        integerList.remove(integer);
        System.out.println("4: " + integerList);
        Integer integer1 = integerList.get(2);
        System.out.println("5: " + integer1 + " " +integerList.indexOf(integer1));
        Integer integer2 = random.nextInt(10);
        System.out.println("6: " + integerList.indexOf(integer2));
        System.out.println("7: " + integerList.remove(integer2));
        System.out.println("8: " + integerList);
        integerList.add(4,random.nextInt(10));
        System.out.println("9: " + integerList);
        List<Integer> sub = integerList.subList(1,4);
        System.out.println("Sublist is " + sub);
    }
}
