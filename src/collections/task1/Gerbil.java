package collections.task1;


import java.util.ArrayList;
import java.util.Iterator;

public class Gerbil {
    private int gerbilNumber;

    private Gerbil(int i) {
        gerbilNumber = i;
    }

    private static void hop(Iterator<Gerbil> iterator) {
        while (iterator.hasNext()){
        Gerbil gerbil = iterator.next();
        System.out.println(gerbil);
        System.out.println();}
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            gerbilArrayList.add(new Gerbil(i));
        }
        hop(gerbilArrayList.iterator());
        }

    }


