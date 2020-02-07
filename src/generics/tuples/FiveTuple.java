package src.generics.tuples;

public class FiveTuple<A,B,C,D,E> extends FourTuple {
    public final E fifth;

    public FiveTuple(A a,B b,C c,D d,E e){
        super(a,b,c,d);
        fifth = e;
    }

    @Override
    public String toString() {
        return "FiveTuple{" +
                "fifth=" + fifth +
                ", third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
