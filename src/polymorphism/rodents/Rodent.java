package polymorphism.rodents;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Create " + this);
    }

    public void addRef() {
        refcount++;
    }

    public String toString() {
        return "Shared " + id;
    }
}

class Rodent {
    private Shared shared;
    private String name = "Rodent";
    private static long counter = 0;
    private final long id = counter++;
    private Borning borning = new Borning(name);
    private Dying dying = new Dying(name);

    public Rodent(Shared shared) {
        System.out.println(this.name + " " + id);
        this.shared = shared;
        shared.addRef();
    }

    public void eat(String food) {
        System.out.println("Rodent eats " + food);
    }

    public String toString() {
        return name + " , " + id;
    }
}
