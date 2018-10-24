package inheritance;

class Component1 {
    Component1(String s) {

        System.out.println("C1 constructor " + s);
    }

    public void dispose() {
        System.out.println("inheritance.Component1 disposed");
    }
}

class Component2 {
    Component2(String b) {
        System.out.println("C2 constructor " + b);
    }

    public void dispose() {
        System.out.println("inheritance.Component2 disposed");
    }
}

class Component3 {
    Component3(String c) {
        System.out.println("C3 constructor " + c);
    }

    public void dispose() {
        System.out.println("inheritance.Component3 disposed");
    }
}

class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    Root(String r) {
        component1 = new Component1(" one");
        component2 = new Component2(" two");
        component3 = new Component3(" three");
        System.out.println("inheritance.Root constructor " + r);
    }

    public void dispose() {
        component3.dispose();
        component2.dispose();
        component1.dispose();
        System.out.println("inheritance.Root disposed");
    }
}

public class Stem extends Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    Stem(String stem) {
        super("four");
        component1 = new Component1(" one");
        component2 = new Component2(" two");
        component3 = new Component3(" three");
        System.out.println("inheritance.Stem() " + stem);
    }

    public void dispose() {
        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();
        System.out.println("inheritance.Stem disposed");

    }

    public static void main(String[] args) {
        Stem stem = new Stem("five");
        try {

        } finally {
            stem.dispose();
        }
    }
}
