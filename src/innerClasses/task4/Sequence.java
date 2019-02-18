package innerClasses.task4;

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
            if (i < items.length) {
                i++;
            }
        }

        private Sequence outer(){
            return Sequence.this;
        }
    }

    private SequenceSelector selector2(){
        return new SequenceSelector();
    }



    public static void main(String[] args) {

        Strings s1 = new Strings("first");
        Strings s2 = new Strings("second");
        Strings s3 = new Strings("third");
        Sequence sequence1 = new Sequence(3);
        Sequence.SequenceSelector ss = sequence1.selector2();
        ss.outer().add(s1);
        ss.outer().add(s2);
        ss.outer().add(s3);

        while (!ss.end()){
            System.out.print(ss.current() +" ");
            ss.next();
        }

    }
}
