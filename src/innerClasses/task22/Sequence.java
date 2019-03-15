package innerClasses.task22;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    private Sequence(int size) {
        items = new Object[size];
    }

    private void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
        }
    }

    private Selector selector() {
        return new SequenceSelector();
    }

    private Selector reverseSelector(){return new SequenceSelector();}

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        Sequence sequence1 = new Sequence(10);
        for (int i = 10;i > 0;i--){
            sequence1.add(Integer.toString(i));
        }
        Selector selector1 = sequence1.reverseSelector();
        while (!selector1.end()){
            System.out.println(selector1.current());
            selector1.next();
        }
    }
}


