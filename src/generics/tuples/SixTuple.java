package src.generics.tuples;

public class SixTuple<A,B,C,D,E,F> extends FiveTuple {
    public final F sixth;

    public SixTuple(A a, B b, C c,D d,E e,F f){
        super(a,b,c,d,e);
        sixth = f;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                "sixth=" + sixth +
                ", fifth=" + fifth +
                ", fourth=" + fourth +
                ", third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
