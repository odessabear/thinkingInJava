package collections.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex7 {
    private static long counter;
    private final long id = counter++;

    private long getId() {
        return id;
    }

    public static void main(String[] args) {
        Ex7[] arrayOfEx7 = {new Ex7(), new Ex7(), new Ex7(), new Ex7(), new Ex7(), new Ex7(), new Ex7(), new Ex7(), new Ex7(), new Ex7(), new Ex7(), new Ex7(),};
        List<Ex7> ex7ArrayList = Arrays.asList(arrayOfEx7);
        for (Ex7 e : ex7ArrayList) {
            System.out.print(e.getId() + " ");
        }
        System.out.println();
        List<Ex7> sub = ex7ArrayList.subList(3, 7);

        System.out.println("Our sublist is:");
        for (Ex7 e : sub) {
            System.out.print(e.getId() + " ");
        }
        System.out.println();
        List<Ex7> copy = new ArrayList<>(ex7ArrayList);

        copy.removeAll(sub);

        ex7ArrayList = copy;
        for (Ex7 e : ex7ArrayList) {
            System.out.print(e.getId() + " ");
        }

    }
}
