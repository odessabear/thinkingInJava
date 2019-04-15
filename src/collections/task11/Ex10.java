package collections.task11;

import java.util.*;

public class Ex10 {
    private static int counter = 0;
    private final int id = counter++;


    public String toString() {
        return "Object with id - " + id;
    }

    private static void callObjects(Iterator<Ex10> ex10Iterator) {
        while (ex10Iterator.hasNext()) {
            Ex10 test = ex10Iterator.next();
            System.out.print(test.toString() + " , ");
        }
        System.out.println();
    }

    private static void addObjectsToCollection(Collection<Ex10> collection, int size) {
        for (int i = 0; i < size; i++) {
            collection.add(new Ex10());
        }
    }


    public static void main(String[] args) {
        List<Ex10> arrEx10 = new ArrayList<>();
        addObjectsToCollection(arrEx10, 10);
        List<Ex10> llEx10 = new LinkedList<>(arrEx10);
        Set<Ex10> ex10Set = new HashSet<>(arrEx10);


        callObjects(arrEx10.iterator());
        callObjects(llEx10.iterator());
        callObjects(ex10Set.iterator());


    }
}
