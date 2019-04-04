package collections.task4;

import java.util.*;

public class NamesGenerator {
    private int count = 0;

    private String next() {
        switch (count) {
            default:
            case 0:
                count++;
                return "Frodo";
            case 1:
                count++;
                return "Sam";
            case 2:
                count++;
                return "Aragorn";
            case 3:
                count++;
                return "Legolas";
            case 4:
                count++;
                return "Gimly";
            case 5:
                count = 0;
                return "Gendalf";

        }
    }

    private void fillArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = next();
        }
    }

    private Collection fillCollection(Collection<String> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(next());
        }
        return list;
    }


    public static void main(String[] args) {
        NamesGenerator generator = new NamesGenerator();
        String[] array = new String[10];
        generator.fillArray(array);
        for (String s : array
             ) {
            System.out.print(s + " , ");
        }

        System.out.println();

        System.out.println(generator.fillCollection(new ArrayList<>(),10));
        System.out.println(generator.fillCollection(new LinkedList<>(),10));
        System.out.println(generator.fillCollection(new HashSet<>(),10));
        System.out.println(generator.fillCollection(new LinkedHashSet<>(),10));
        System.out.println(generator.fillCollection(new TreeSet<>(),10));
    }
}
