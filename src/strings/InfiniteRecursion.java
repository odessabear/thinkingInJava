package strings;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> ir = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ir.add(new InfiniteRecursion());
        }
        System.out.println(ir);
    }
}
