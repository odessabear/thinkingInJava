package collections.task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SequenceWitIterator {
    private List<Object> items;


    private SequenceWitIterator(int size) {
        items = new ArrayList<>(size);
    }

    private void addValue(Object x) {
        items.add(x);
    }

    private Iterator iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        SequenceWitIterator swi = new SequenceWitIterator(10);
        for (int i = 0; i < 10; i++) {
            swi.addValue(i);
        }
        Iterator iterator = swi.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

}
