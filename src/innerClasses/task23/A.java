package innerClasses.task23;

interface U {
    void firstMethod();

    void secondMethod();

    void thirdMethod();
}

public class A {
    private U getU() {
        return new U() {
            @Override
            public void firstMethod() {
                System.out.println("It's first method");
            }

            @Override
            public void secondMethod() {
                System.out.println("It's second method");

            }

            @Override
            public void thirdMethod() {
                System.out.println("It's third method");

            }
        };
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B();

        b.insertInArray(a1.getU());
        b.insertInArray(a2.getU());
        b.insertInArray(a3.getU());
        b.getMethods();
        System.out.println();
        System.out.println();
        b.setNull(3);
        b.getMethods();
    }
}

class B {
    private U[] array = new U[3];

    void insertInArray(U u) {
        for (int i = 0; i < array.length; i++) {
            array[i] = u;
        }
    }

    void setNull(int i) {
        array[i] = null;
    }

    void getMethods() {
        for (U u : array) {
            if (u != null) {
                u.firstMethod();
                u.secondMethod();
                u.thirdMethod();
                System.out.println();
            }
        }
    }
}
