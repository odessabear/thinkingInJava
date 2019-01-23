package interfaces.task16;

import java.util.Random;

public class CharsGenerator {
    private static Random random = new Random();
    private static final char[] symbols = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public char generator() {
//        char[] randomSymbols = new char[26];
//        for (int i = 0; i < symbols.length; i++){
//
//            randomSymbols; randomSymbols[i] = symbols[random.nextInt(symbols.length)];
//        }
        return symbols[random.nextInt(symbols.length)];
}

    public static void main(String[] args) {
        CharsGenerator cg = new CharsGenerator();
        System.out.println(cg.generator());
    }
}
