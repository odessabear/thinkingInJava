package collections.task3;


import java.util.ArrayList;

interface Selector {
    boolean end();

    Object current();

    void next();
}


public class Sequence {
    private ArrayList<Object> items = new ArrayList<>();

    private void add(Object x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            i++;
        }

    }

    private Selector selector() {
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++){
            sequence.add(i);
        }
        Selector selector = sequence.selector();

        while (!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
        sequence.add(10);
        sequence.add(11);
        sequence.add(12);
        sequence.add(13);
        sequence.add(14);
        sequence.add("That's All!");
        while (!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}

