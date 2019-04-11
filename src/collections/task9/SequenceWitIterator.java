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

    private class SequenceSelector {
        private int i;
        public int end() {
            return items.size();
        }

        public Object current() {
            return items.get(i);
        }
    }

    private SequenceSelector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        SequenceWitIterator swi = new SequenceWitIterator(10);

    }
}
