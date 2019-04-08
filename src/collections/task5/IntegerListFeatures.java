package collections.task5;

import java.util.*;

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
        System.out.println("10: " + integerList.containsAll(sub));
        Collections.sort(sub);
        System.out.println("After sorting " + sub);
        System.out.println("11: " + integerList.containsAll(sub));
        Collections.shuffle(sub,random);
        System.out.println("After shuffling " + sub);
        System.out.println("12: " + integerList.containsAll(sub));
        List<Integer> copy = new ArrayList<>(integerList);
        sub = Arrays.asList(integerList.get(1),integerList.get(4));
        System.out.println("Sub is " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(integerList);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.retainAll(sub);
        System.out.println("15: " + copy);
        copy.set(1,random.nextInt(10));
        System.out.println("16: " + copy);
        copy.addAll(2,sub);
        System.out.println("17: " + copy);
        System.out.println(integerList.isEmpty());
        integerList.clear();
        System.out.println("19: " + integerList);
        System.out.println("20: " + integerList.isEmpty());
        integerList.addAll(listOfRandInteger(4,10));
        System.out.println("21: " + integerList);
        Object[] o = integerList.toArray();
        System.out.println("22: " + o[3]);
        Integer[] pa = integerList.toArray(new Integer[0]);
        System.out.println("23: " + pa[3]);
    }
}
