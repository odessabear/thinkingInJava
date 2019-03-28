package collections.task2;

import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 10; i++){
            integers.add(i);
        }
        for (Integer i: integers
             ) {
            System.out.print(i + " , ");
        }
    }
}
