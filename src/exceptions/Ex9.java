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
    static void fooBar(int x) throws Exception1st, Exception2nd, Exception3rd {
        if (x < 0) throw new Exception1st("x < 0");
        if (x == 0) throw new Exception1st("x == 0");
        if (x > 0) throw new Exception1st("x > 0");

    }

    public static void main(String[] args) {
        try {
            fooBar(-3);
            fooBar(0);
            fooBar(8);
        } catch (Exception e) {
            System.out.println("caught all exceptions ");
            e.printStackTrace();
        }
    }

}
