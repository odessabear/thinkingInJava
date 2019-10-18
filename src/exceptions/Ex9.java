package exceptions;

class Exception1st extends Exception {
    Exception1st(String message) {
        super(message);
    }
}

class Exception2nd extends Exception {
    Exception2nd(String message) {
        super(message);
    }
}

class Exception3rd extends Exception {
    Exception3rd(String message) {
        super(message);
    }

}

public class Ex9 {
    private static Integer [] numbers = new Integer[2];
    static void fooBar(int x) throws Exception1st, Exception2nd, Exception3rd {
        if (x < 0) throw new Exception1st("x < 0");
        if (x == 0) throw new Exception2nd("x == 0");
        if (x <= 1) throw new Exception3rd("x > 0");

    }

    public static void main(String[] args) {
//        for (int i = -1; i <= 1; i++) {
            try {
//                fooBar(i);
                fooBar(numbers[0]);
            } catch (Exception e) {
                System.out.println("caught all exceptions ");
                e.printStackTrace();
            } finally {
                System.out.println("Done in finally block!");
            }

    }

}
