package strings;

import java.util.Scanner;

public class Scanner20 {
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private String s;

    public Scanner20(String s) {
        Scanner scanner = new Scanner(s);
        anInt = scanner.nextInt();
        aLong = scanner.nextLong();
        aFloat = scanner.nextFloat();
        aDouble = scanner.nextDouble();
        this.s = scanner.next();
    }

    public String toString() {
        return anInt + " " + aLong + " " + aFloat + " " + aDouble + " " + s;
    }

    public static void main(String[] args) {
        Scanner20 s20 = new Scanner20("25 135679 2.7 3.565465 yes");
        System.out.println(s20);
    }
}
