package inheritance;

class Cleanser {
    private String s = "inheritance.Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        System.out.println(cleanser);
    }

}


public class Detergent {
    private Cleanser cleanser = new Cleanser();

    public void scrub() {
        cleanser.append(" delegate scrub string");
        cleanser.scrub();

    }

    public void dilute() {
        cleanser.append(" delegate dilute string");
        cleanser.dilute();
    }

    public void apply() {
        cleanser.append(" delegate apply string");
        cleanser.apply();
    }

    @Override
    public String toString() {
        return "inheritance.Detergent{" +
                "cleanser=" + cleanser +
                '}';
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.apply();
        detergent.dilute();
        detergent.scrub();
        System.out.println(detergent);

        Cleanser.main(args);

    }
}
