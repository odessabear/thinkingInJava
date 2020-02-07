package src.generics.tuples;
class First{}
class Second{}
class Third{}
class Fourth{}
class Fifth{}
class Sixth{}

public class SixTupleTest {
    static SixTuple<First,Second,Third,Fourth,Fifth,Sixth> sixTuple(){
        return new SixTuple(new First(),new Second(),new Third(),new Fourth(),new Fifth(),new Sixth());
    }

    public static void main(String[] args) {
        System.out.println(sixTuple());
    }
}
