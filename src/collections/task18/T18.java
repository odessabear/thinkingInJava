package collections.task18;

import java.util.*;

public class T18 {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"first");
        map.put(6,"sixth");
        map.put(2,"second");
        map.put(5,"fifth");
        map.put(3,"third");
        map.put(4,"fourth");

        System.out.println(map);

        System.out.println();

        Set<Integer> sortedSet = new HashSet<>(map.keySet());
        System.out.println(sortedSet);
        System.out.println();
        Set<Integer> sortedSet1 = new LinkedHashSet<>(map.keySet());
        System.out.println(sortedSet1);

        System.out.println();

        Map<Integer,String > map1 = new HashMap<>(map);

        System.out.println(map1);
    }
}
