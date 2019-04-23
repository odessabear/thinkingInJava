package collections.task14;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class CollectionsEx14 {
    private static void addMiddle(List<Integer> l) {
Random random = new Random();
        for(int i = 0; i< 8;i++) {
            ListIterator<Integer> it =
                    l.listIterator((l.size())/2);
            it.add(random.nextInt(10));
            System.out.println(l);
        }
    }
    public static void main(String[] args) {
        List<Integer> li = new LinkedList<>();

        CollectionsEx14.addMiddle(li);
    }
}
