package innerClasses.task1.task2;

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Strings {
    private String word;

     Strings(String s) {
        word = s;
    }

    public String toString() {
        return word;
    }
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
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
            if (i < items.length) {
                i++;
            }
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {

        Strings s1 = new Strings("first");
        Strings s2 = new Strings("second");
        Strings s3 = new Strings("third");
        Sequence sequence1 = new Sequence(3);
        sequence1.add(s1);
        sequence1.add(s2);
        sequence1.add(s3);

        Selector selector1 = sequence1.selector();
        while (!selector1.end()){
            System.out.print(selector1.current() +" ");
            selector1.next();
        }

    }
}
