package interfaces.task16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class CharsGenerator implements Readable {
    private static Random random = new Random();
    private int count;

    private CharsGenerator(int count) {
        this.count = count;
    }

    private static char[] generator() {
        char[] randomChars = new char[10];
        for (int i = 0; i < randomChars.length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            randomChars[i] = randomChar;
        }
        return randomChars;
    }

    @Override
    public int read(CharBuffer cb) {
        CharsGenerator cg = new CharsGenerator(count);
        if (count-- == 0)
            return -1;
        for (int i = 0; i < 4; i++) {
            cb.append(generator()[random.nextInt(generator().length)]);
        }
        cb.append(" ");
        return 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new CharsGenerator(8));
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + " ");
        }
    }
}
