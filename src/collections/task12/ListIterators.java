package collections.task12;

import java.util.*;

public class ListIterators {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerList1 = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            integerList1.add(random.nextInt(10));
        }
        System.out.println(integerList1);

        List<Integer> integerList2 = new ArrayList<>(10);

        ListIterator<Integer> it1 = integerList1.listIterator();
        while (it1.hasNext()) {
            it1.next();
        }
        while (it1.hasPrevious()){
            integerList2.add(it1.previous());
        }
        System.out.println();
        System.out.println(integerList2);
    }
}
