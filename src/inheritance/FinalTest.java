package inheritance;


public class FinalTest {
    private final int I1 = 45;
    private static final int I2 = 36;

    private int getI1(){
        return I1;
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();

        System.out.println(finalTest.getI1());
        int f = I2*I2;
        System.out.println(I2);


    }
}
