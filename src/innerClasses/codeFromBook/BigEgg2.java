package innerClasses.codeFromBook;

class Egg2 {
    protected class Yolk {
         Yolk() {
            System.out.println("Egg2.Yolk()");
        }

        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }

    private Yolk y = new Yolk();

     Egg2() {
        System.out.println("New Egg2()");
    }

      void insertYolk(Yolk yy) {
        y = yy;
    }

     void g() {
        y.f();
    }
}

public class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
          Yolk() {
            System.out.println("BigEgg2.Yolk()");
        }

        public void f() {
            System.out.println("BigEgg.Yolk.f()");
        }
    }

    private BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 egg2 = new BigEgg2();
        egg2.g();
    }
}
