package interfaces.task17;

public interface Names {
    String NAME1 = "Bob",NAME2 = "John",NAME3 = "Fill";
}
class NamesImpl implements Names{
    public static void main(String[] args){
        System.out.println(Names.NAME1);
        System.out.println(Names.NAME2);
        System.out.println(Names.NAME3);
    }
}