package interfaces.abstracts;

import interfaces.subinterface.SubInterface;

public class SubInterfaceImpl implements SubInterface {

    @Override
    public void subPrint() {
        System.out.println("Result of the implementations :");
    }

    @Override
    public int sumOfValues(int x, int y) {
        return x + y;
    }

    @Override
    public String lowerCasePrint(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        String s = "WHAT";

        SubInterfaceImpl impl = new SubInterfaceImpl();

        impl.subPrint();
        System.out.println(impl.sumOfValues(x,y));
        System.out.println(impl.lowerCasePrint(s));
    }
}
